package com.company;

public class Car {

    private int doors; // Se for private só vai funcinar nessa classe.
    private int wheels;
    private String model; // Se for public vai funcinar em outra classe tambem.
    private String engine;
    private String colour;

    public void setModel(String model) {
       // this.model = model;

        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
