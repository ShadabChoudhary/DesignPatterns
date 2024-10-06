package com.example.lldbasics.DesignPatterns.factoryPattern;

import com.example.lldbasics.DesignPatterns.factoryPattern.button.Button;
import com.example.lldbasics.DesignPatterns.factoryPattern.dropDown.DropDown;

public interface UIFactory {
    public Button createButton();
    public DropDown createDropDown();
}
