package com.company;

public class Carpet {
    private double real;
    private double imaginary;

    public Carpet(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(Carpet complexNumber) {
        add(complexNumber.getReal(), complexNumber.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(Carpet complexNumber) {
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }
}
