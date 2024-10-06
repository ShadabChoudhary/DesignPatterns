package com.example.lldbasics.DesignPatterns.factoryPattern;

import com.example.lldbasics.DesignPatterns.factoryPattern.button.Button;
import com.example.lldbasics.DesignPatterns.factoryPattern.button.IosButton;
import com.example.lldbasics.DesignPatterns.factoryPattern.dropDown.DropDown;
import com.example.lldbasics.DesignPatterns.factoryPattern.dropDown.IosDropDown;

public class IosFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
