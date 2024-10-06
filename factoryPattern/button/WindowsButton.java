package com.example.lldbasics.DesignPatterns.factoryPattern.button;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Windows Button clicked");
    }

    @Override
    public void showButton() {
        System.out.println("Windows Button showed");
    }
}
