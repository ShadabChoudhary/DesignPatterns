package com.example.lldbasics.DesignPatterns.prototype;

public class Client {

    public static void setValues(StudentRegistry studentRegistry){
        Student shadab = new Student();
        shadab.setName("Shadab");
        shadab.setCity("Mumbai");
        shadab.setAvgPsp(80.00);
        shadab.setInstructor("Dheeraj");
        studentRegistry.addPrototype("Shadab", shadab);

        IntelligentStudent dheeraj = new IntelligentStudent();
        dheeraj.setIq(100);
        dheeraj.setName("Dheeraj");
        dheeraj.setCity("Bangalore");
        dheeraj.setAvgPsp(100.00);
        dheeraj.setInstructor("Scaler");
        studentRegistry.addPrototype("Dheeraj", dheeraj);
    }

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        setValues(registry);

        Student st = registry.getPrototype("Shadab").clone();
        st.setName("Shadab1");
        st.setAge(22);
        st.setCity("Mumbai");

        Student st2 = registry.getPrototype("Dheeraj").clone();

        System.out.println("Debug here");
    }
}
