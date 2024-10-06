package com.example.lldbasics.DesignPatterns.prototype;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(){
        //default constructor
    }
    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

    //after adding some new attributes we have to clone the Intelligent Student along with the Student object
    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
