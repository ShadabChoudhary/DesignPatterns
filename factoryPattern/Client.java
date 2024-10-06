package com.example.lldbasics.DesignPatterns.factoryPattern;

import com.example.lldbasics.DesignPatterns.factoryPattern.button.Button;
import com.example.lldbasics.DesignPatterns.factoryPattern.dropDown.DropDown;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getFactory("IOS");

        Button button = uiFactory.createButton();
        button.click();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.clickDropDown();
    }
}
