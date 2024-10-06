package com.example.lldbasics.DesignPatterns.prototype;

public class Student implements  Prototype{
    private String name;
    private int age;
    private String city;
    private double avgPsp;
    private String batch;
    private String Instructor;

    public Student(){
        //default constructor
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.city = student.city;
        this.avgPsp = student.avgPsp;
        this.batch = student.batch;
        this.Instructor = student.Instructor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAvgPsp(double avgPsp) {
        this.avgPsp = avgPsp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setInstructor(String instructor) {
        Instructor = instructor;
    }

    //method to clone Student Object
    @Override
    public Student clone() {
        return new Student(this);
    }
}
