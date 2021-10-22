/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.farooq.flink;

import com.farooq.flink.avro.AvroDeserializationSchema;
import com.farooq.flink.avro.AvroSerializationSchema;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.typeutils.TypeExtractor;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer011;

import java.util.Arrays;
import java.util.Properties;

/**
 * Skeleton for a Flink Streaming Job.
 *
 * <p>For a tutorial how to write a Flink streaming application, check the
 * tutorials and examples on the <a href="https://flink.apache.org/docs/stable/">Flink Website</a>.
 *
 * <p>To package your application into a JAR file for execution, run
 * 'mvn clean package' on the command line.
 *
 * <p>If you change the name of the main class (with the public static void main(String[] args))
 * method, change the respective entry in the POM.xml file (simply search for 'mainClass').
 */
public class StreamingJob {

	static String topicId = "test";
	static String kafkaPort = "localhost:9092";
	static String zkPort = "localhost:2181";

	static SerializationSchema<Person> ser = new AvroSerializationSchema<>(Person.class);
	static DeserializationSchema<Person> deser = new AvroDeserializationSchema<>(Person.class);


	public static void main(String[] args) throws Exception {
		// set up the streaming execution environment
		final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        Person person = new Person();
        person.setId(42);
        person.setName("Felix");
        person.setEmail("test@test.com");


        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", kafkaPort);
        properties.setProperty("group.id", topicId);
        //properties.setProperty("zookeeper.connect", zkPort);
        properties.setProperty("batch.size", "0");

        TypeInformation<Person> typeInfo = TypeExtractor.getForClass(Person.class);
        DataStream<Person> stream = env.fromCollection(Arrays.asList(person), typeInfo);
        stream.addSink(new FlinkKafkaProducer<Person>(topicId, ser, properties));

        DataStreamSource<Person> messageStream = env
                .addSource(new FlinkKafkaConsumer<Person>(topicId, deser, properties));
        messageStream.print();



		// execute program
		env.execute("Flink Streaming Java API Skeleton");
	}
}
