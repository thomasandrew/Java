package com.company;

public class Main {

    public static void main(String[] args) {
        boolean cat = Main.isCatPlaying(true,10);
        System.out.println(cat);

        boolean cat1 = isCatPlaying(false,36);
        System.out.println(cat1);

        boolean cat2 = isCatPlaying(true,33);
        System.out.println(cat2);

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

             if(temperature >= 25 && temperature <= 35 && summer == false) {

                 return true;

             }

             else {

                  return (summer) && temperature >= 25 && temperature <= 45;

             }

    }
}
