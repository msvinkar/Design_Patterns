package com.milindvinkar.patterns.builder;

public class Student {
    private int id;
    private String name;
    private String address;
    private String contactNumber;
    private String emailId;
    private String className;
    private String classTeacher;

    private Student(int id, String name, String address,
                    String contactNumber, String emailId, String className, String classTeacher) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.className = className;
        this.classTeacher = classTeacher;
    }

    public static class Builder {
        private int id;
        private String name;
        private String address;
        private String contactNumber;
        private String emailId;
        private String className;
        private String classTeacher;

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder withEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public Builder withClassName(String className) {
            this.className = className;
            return this;
        }

        public Builder withClassTeacher(String classTeacher) {
            this.classTeacher = classTeacher;
            return this;
        }

        /**
         * @return This ensures that every time a new instance is returned.
         */
        public Student build() {
            return new Student(id, name, address, contactNumber, emailId, className, classTeacher);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", className='" + className + '\'' +
                ", classTeacher='" + classTeacher + '\'' +
                '}';
    }
}
