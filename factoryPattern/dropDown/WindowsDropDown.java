package com.example.lldbasics.DesignPatterns.factoryPattern.dropDown;

public class WindowsDropDown implements DropDown{
    @Override
    public void clickDropDown() {
        System.out.println("Clicked Windows DropDown");
    }

    @Override
    public void showDropDown() {
        System.out.println("Show Drop Down for Windows");
    }
}
