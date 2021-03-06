package com.farooq.flink;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Person extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = -4372457208513393133L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Person\",\"namespace\":\"flink.parquet.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"email\",\"type\":[\"null\",\"string\"],\"default\":null} ]}");
    public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
    @Deprecated public java.lang.CharSequence name;
    @Deprecated public int id;
    @Deprecated public java.lang.CharSequence email;


    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public Person() {}

    /**
     * All-args constructor.
     * @param name The new value for name
     * @param id The new value for id
     * @param email The new value for email
     * @param phone The new value for phone
     */
    public Person(java.lang.CharSequence name, java.lang.Integer id, java.lang.CharSequence email) {
        this.name = name;
        this.id = id;
        this.email = email;

    }

    public org.apache.avro.Schema getSchema() { return SCHEMA$; }
    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0: return name;
            case 1: return id;
            case 2: return email;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0: name = (java.lang.CharSequence)value$; break;
            case 1: id = (java.lang.Integer)value$; break;
            case 2: email = (java.lang.CharSequence)value$; break;

            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'name' field.
     * @return The value of the 'name' field.
     */
    public java.lang.CharSequence getName() {
        return name;
    }

    /**
     * Sets the value of the 'name' field.
     * @param value the value to set.
     */
    public void setName(java.lang.CharSequence value) {
        this.name = value;
    }

    /**
     * Gets the value of the 'id' field.
     * @return The value of the 'id' field.
     */
    public java.lang.Integer getId() {
        return id;
    }

    /**
     * Sets the value of the 'id' field.
     * @param value the value to set.
     */
    public void setId(java.lang.Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the 'email' field.
     * @return The value of the 'email' field.
     */
    public java.lang.CharSequence getEmail() {
        return email;
    }

    /**
     * Sets the value of the 'email' field.
     * @param value the value to set.
     */
    public void setEmail(java.lang.CharSequence value) {
        this.email = value;
    }



    /**
     * Creates a new Person RecordBuilder.
     * @return A new Person RecordBuilder
     */
    public static Person.Builder newBuilder() {
        return new Person.Builder();
    }

    /**
     * Creates a new Person RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new Person RecordBuilder
     */
    public static Person.Builder newBuilder(Person.Builder other) {
        return new Person.Builder(other);
    }

    /**
     * Creates a new Person RecordBuilder by copying an existing Person instance.
     * @param other The existing instance to copy.
     * @return A new Person RecordBuilder
     */
    public static Person.Builder newBuilder(Person other) {
        return new Person.Builder(other);
    }

    /**
     * RecordBuilder for Person instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Person>
            implements org.apache.avro.data.RecordBuilder<Person> {

        private java.lang.CharSequence name;
        private int id;
        private java.lang.CharSequence email;
        private java.util.List<java.lang.CharSequence> phone;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(Person.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.name)) {
                this.name = data().deepCopy(fields()[0].schema(), other.name);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.id)) {
                this.id = data().deepCopy(fields()[1].schema(), other.id);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.email)) {
                this.email = data().deepCopy(fields()[2].schema(), other.email);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.phone)) {
                this.phone = data().deepCopy(fields()[3].schema(), other.phone);
                fieldSetFlags()[3] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing Person instance
         * @param other The existing instance to copy.
         */
        private Builder(Person other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.name)) {
                this.name = data().deepCopy(fields()[0].schema(), other.name);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.id)) {
                this.id = data().deepCopy(fields()[1].schema(), other.id);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.email)) {
                this.email = data().deepCopy(fields()[2].schema(), other.email);
                fieldSetFlags()[2] = true;
            }

        }

        /**
         * Gets the value of the 'name' field.
         * @return The value.
         */
        public java.lang.CharSequence getName() {
            return name;
        }

        /**
         * Sets the value of the 'name' field.
         * @param value The value of 'name'.
         * @return This builder.
         */
        public Person.Builder setName(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.name = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'name' field has been set.
         * @return True if the 'name' field has been set, false otherwise.
         */
        public boolean hasName() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'name' field.
         * @return This builder.
         */
        public Person.Builder clearName() {
            name = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'id' field.
         * @return The value.
         */
        public java.lang.Integer getId() {
            return id;
        }

        /**
         * Sets the value of the 'id' field.
         * @param value The value of 'id'.
         * @return This builder.
         */
        public Person.Builder setId(int value) {
            validate(fields()[1], value);
            this.id = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'id' field has been set.
         * @return True if the 'id' field has been set, false otherwise.
         */
        public boolean hasId() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'id' field.
         * @return This builder.
         */
        public Person.Builder clearId() {
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'email' field.
         * @return The value.
         */
        public java.lang.CharSequence getEmail() {
            return email;
        }

        /**
         * Sets the value of the 'email' field.
         * @param value The value of 'email'.
         * @return This builder.
         */
        public Person.Builder setEmail(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.email = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'email' field has been set.
         * @return True if the 'email' field has been set, false otherwise.
         */
        public boolean hasEmail() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'email' field.
         * @return This builder.
         */
        public Person.Builder clearEmail() {
            email = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'phone' field.
         * @return The value.
         */
        public java.util.List<java.lang.CharSequence> getPhone() {
            return phone;
        }

        /**
         * Sets the value of the 'phone' field.
         * @param value The value of 'phone'.
         * @return This builder.
         */
        public Person.Builder setPhone(java.util.List<java.lang.CharSequence> value) {
            validate(fields()[3], value);
            this.phone = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'phone' field has been set.
         * @return True if the 'phone' field has been set, false otherwise.
         */
        public boolean hasPhone() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'phone' field.
         * @return This builder.
         */
        public Person.Builder clearPhone() {
            phone = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        @Override
        public Person build() {
            try {
                Person record = new Person();
                record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.id = fieldSetFlags()[1] ? this.id : (java.lang.Integer) defaultValue(fields()[1]);
                record.email = fieldSetFlags()[2] ? this.email : (java.lang.CharSequence) defaultValue(fields()[2]);

                return record;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    private static final org.apache.avro.io.DatumWriter
            WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

    @Override public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    private static final org.apache.avro.io.DatumReader
            READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

    @Override public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

}