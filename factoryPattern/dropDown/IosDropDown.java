package com.example.lldbasics.DesignPatterns.factoryPattern.dropDown;

public class IosDropDown implements DropDown{
    @Override
    public void clickDropDown() {
        System.out.println("Clicked IOS DropDown");
    }

    @Override
    public void showDropDown() {
        System.out.println("Show Drop Down for IOS");
    }
}
