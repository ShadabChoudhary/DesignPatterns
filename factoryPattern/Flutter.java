package com.example.lldbasics.DesignPatterns.factoryPattern;

public class Flutter {

    public UIFactory getFactory(String platFromName){
        if(platFromName.equals("Android")){
            return new AndroidFactory();
        }
        else if(platFromName.equals("IOS")){
            return new IosFactory();
        }
        else if (platFromName.equals("Windows")) {
            return new WindowsFactory();
        }else{
            return null;
        }
    }
}
