package com.example.lldbasics.DesignPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> registry = new HashMap<>();

    public void addPrototype(String name, Student student){
        registry.put(name, student);
    }

    public Student getPrototype(String name){
        return registry.get(name);
    }
}
