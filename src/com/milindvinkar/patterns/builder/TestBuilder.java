package com.milindvinkar.patterns.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Student.Builder builder = new Student.Builder();
        Student student = builder.withId(1)
                .withAddress("dummyAddress")
                .withClassName("Class A")
                .withClassTeacher("TecherName")
                .withEmailId("dummyEmail")
                .withContactNumber("dummyContactNumber")
                .withName("dummyName")
                .build();

        System.out.println(student);


    }
}
