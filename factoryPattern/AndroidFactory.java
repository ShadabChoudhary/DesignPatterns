package com.example.lldbasics.DesignPatterns.factoryPattern;

import com.example.lldbasics.DesignPatterns.factoryPattern.button.AndroidButton;
import com.example.lldbasics.DesignPatterns.factoryPattern.button.Button;
import com.example.lldbasics.DesignPatterns.factoryPattern.dropDown.AndroidDropDown;
import com.example.lldbasics.DesignPatterns.factoryPattern.dropDown.DropDown;

public class AndroidFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
