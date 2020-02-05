package com.company;

public class Car {

    private double balance;

    // construtor.
    public Car(double initialBalance) { // O construtor tem que ter o mesmo nome que a classe.
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

}
