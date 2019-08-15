package com.company;

public class Main {

    public static void main(String[] args) {

        String mystring = "This is a string";
        System.out.println("string: "+ mystring);

        mystring = mystring + ", string is very cool";
        System.out.println(mystring);

        //unicode

        mystring = mystring + "\u00A9 2019";
        System.out.println(mystring);

        //string numbers

        String numberstring = "250.55";
        numberstring = numberstring + "49.95";
        System.out.println(numberstring);

        String laststring = "10";
        int myint = 50;//vai ser tratado como uma string

        laststring = laststring + myint;
        System.out.println("laststring: "+laststring);

        double doublestringLoL = 120.47d;//tambem e tratado como uma string
        laststring = laststring + doublestringLoL;
        System.out.println("laststring float: "+ laststring);



    }
}
