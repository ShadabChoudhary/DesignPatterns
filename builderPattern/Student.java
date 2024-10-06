package com.example.lldbasics.DesignPatterns.builderPattern;

public class Student {
    String name;
    int age;
    String number;
    String batch;
    double psp;
    int gradYear;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.number = builder.getNumber();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.gradYear = builder.getGradYear();
    }

    public static class Builder{
        String name;
        int age;
        String number;
        String batch;
        double psp;
        int gradYear;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getNumber() {
            return number;
        }

        public Builder setNumber(String number) {
            this.number = number;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build(){
            //validating before creating an object of a student
            if(this.gradYear <= 2022){
                throw new RuntimeException("Grad year should be more then 2022");
            }
            if(this.psp <= 80.00){
                throw new RuntimeException("PSP should be more then 80.00");
            }
            return new Student(this);
        }
    }
}
