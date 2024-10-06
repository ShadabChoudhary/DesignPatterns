package com.example.lldbasics.DesignPatterns.factoryPattern.dropDown;

public class AndroidDropDown implements DropDown{
    @Override
    public void clickDropDown() {
        System.out.println("Clicked Android DropDown");
    }

    @Override
    public void showDropDown() {
        System.out.println("Show Drop Down for Android");
    }
}
