package com.company;

public class Main {

    public static void main(String[] args) {


                byte newbyte = 100;
                short newshort = 30000;
                int newint = 1000;
                long newlong = 50000L + 10L * (newbyte + newshort + newint);
                System.out.println("Result: "+newlong);

                //is not part of the exercise

                short myshort = (short)(1000 + 10 * (newbyte + newshort + newint));
                System.out.println(myshort);



      }
    }
