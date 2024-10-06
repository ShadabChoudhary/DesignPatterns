package com.example.lldbasics.DesignPatterns.factoryPattern.button;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("AndroidButton clicked");
    }

    @Override
    public void showButton() {
        System.out.println("AndroidButton showed");
    }
}
