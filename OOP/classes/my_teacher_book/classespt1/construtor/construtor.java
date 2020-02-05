package com.company;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

       Car account1 = new Car(50.00);
       Car account2 = new Car(-7.53);

       System.out.printf("Account1 balance: $%.2f\n",account1.getBalance());
       System.out.printf("Account2 balance: $%.2f\n",account2.getBalance());

       Scanner input = new Scanner(System.in);
       input.useLocale(Locale.ENGLISH);
       double depositAmount;

       System.out.print("Enter deposit amount for account1: ");
       depositAmount = input.nextDouble();
       System.out.printf("\nAdding %.2f to account1 balance\n\n",depositAmount);
       account1.credit(depositAmount);

       System.out.printf("Account1 balance $%.2f\n",account1.getBalance());
       System.out.printf("Accoutn2 balance $%.2f\n",account2.getBalance());

       System.out.print("Enter deposit amount for account2: ");
       depositAmount = input.nextDouble();
       System.out.printf("\nAdding %.2f to account2 balance\n\n",depositAmount);
       account2.credit(depositAmount);

       System.out.printf("Account1 balance: $%.2f\n",account1.getBalance());
       System.out.printf("Account2 balance: $%.2f\n",account2.getBalance());


    }
}


