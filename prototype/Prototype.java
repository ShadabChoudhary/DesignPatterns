package com.example.lldbasics.DesignPatterns.prototype;

public interface Prototype<T> {
    //creating prototype as an interface so that people will force to implement clone()
    //making the data type as generics helps us to return any type of object after cloning
    T clone();
}
