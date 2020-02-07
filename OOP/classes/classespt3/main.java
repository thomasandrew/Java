package com.company;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
       // Car bobsAccount = new Car("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        Car bobsAccount = new Car();
        System.out.println(bobsAccount.getNumber()); // get it is used to print something from the set.
        System.out.println(bobsAccount.getBalance());

       /* bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustumer_name("Bob Brown"); I don't need to use setters because i am already using a constructor.
        bobsAccount.setCustume_email_address("myemail@bob.com");
        bobsAccount.setCustumer_number("(087) 123-4567");
       */

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}


