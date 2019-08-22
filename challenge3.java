package com.company;

public class Main {

    public static void main(String[] args) {

        double newvalue = 20.00, thisvalue = 80.00;

        double result = (newvalue + thisvalue) * 100;

        double result2 = result % 40.00d;
        System.out.println(result2);

        boolean istrue = result2 == 0.0 ? true : false;
        if(istrue) {
             System.out.println("it is 0.0");
        }

        if(!istrue) {
            System.out.println("got some reminder");
        }
    }
}
