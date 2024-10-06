package com.example.lldbasics.DesignPatterns.factoryPattern.button;

public class IosButton implements Button{
    @Override
    public void click() {
        System.out.println("IosButton clicked");
    }

    @Override
    public void showButton() {
        System.out.println("IosButton showed");
    }
}
