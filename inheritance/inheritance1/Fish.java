package com.company;

public class Fish extends Carpet {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eys, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void moveBackFin(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
