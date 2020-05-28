package com.company;

import java.awt.*;

public class Case {
    private String model;
    private String manufacturer;
    private String powersupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powersupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressesd");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
