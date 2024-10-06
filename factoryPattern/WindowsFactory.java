package com.example.lldbasics.DesignPatterns.factoryPattern;

import com.example.lldbasics.DesignPatterns.factoryPattern.button.Button;
import com.example.lldbasics.DesignPatterns.factoryPattern.button.WindowsButton;
import com.example.lldbasics.DesignPatterns.factoryPattern.dropDown.DropDown;
import com.example.lldbasics.DesignPatterns.factoryPattern.dropDown.WindowsDropDown;

public class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
