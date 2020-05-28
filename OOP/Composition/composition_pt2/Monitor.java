package com.company;

public class Monitor {

    private String model;
    private String manuFacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manuFacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manuFacturer = manuFacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " is colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManuFacturer() {
        return manuFacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
