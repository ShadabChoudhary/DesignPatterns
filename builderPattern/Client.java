package com.example.lldbasics.DesignPatterns.builderPattern;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        builder.setName("Shadab");
//        builder.setAge(22);
//        builder.setNumber("123456789");
//        builder.setPsp(81.00);
//        builder.setBatch("beginner");
//        builder.setGradYear(2023);
//        Student s = builder.build();

        //creating an object of a student by passing builder object inside my student
//        Student student = new Student(builder);

        //optimise way in one-liner
        Student s = Student.getBuilder()
                        .setName("Shadab")
                        .setAge(22)
                        .setGradYear(2023)
                        .setPsp(81.00)
                        .build();


        System.out.println("Debug here");
    }
}
