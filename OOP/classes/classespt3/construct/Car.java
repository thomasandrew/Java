package com.company;

import java.util.Scanner;

public class Car {
   // private String number;
   // private double balance;
   // private String custumer_name;
   // private String custume_email_address;
   // private String custumer_number;

   // public Car() {
   //     this("56789", 2.50, "Default name", "Default address", "default phone"); // Calling another constructor from this constructor and this has to be on the firts line of the code.
   //     System.out.println("Empty constructor called");
   // }

   // public Car(String number, double balance, String custumer_name, String custume_email_address, String custumer_number) {
   //     System.out.println("Account constructor with parameters called");
   //     this.number = number;
   //     this.balance = balance;
   //     this.custumer_name = custumer_name;
   //     this.custume_email_address = custume_email_address;
   //     this.custumer_number = custumer_number;
   // }

   // public Car(String custumer_name, String custume_email_address, String custumer_number) {
   //     this("99999",100.55, custumer_name, custume_email_address, custumer_number);
        /*this.custumer_name = custumer_name;
          this.custume_email_address = custume_email_address;
        this.custumer_number = custumer_number;
        */
   // }

   // public void deposit(double depositAmount) {
   //     this.balance += depositAmount;
   //     System.out.println("Deposit of " + depositAmount + " made. Now balance is " + this.balance);
   // }

   // public void withdrawal(double withdrawalAmount) {
   //     if (this.balance - withdrawalAmount < 0) {
   //         System.out.println("Only " + this.balance + " available. Withdrawal not processed");
   //     } else {
   //         this.balance -= withdrawalAmount;
   //         System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
   //     }
   // }

   // public String getNumber() {
   //     return number;
   // }

   // public void setNumber(String number) {
   //     this.number = number;
   // }

   // public double getBalance() {
   //     return balance;
   // }

   // public void setBalance(double balance) {
   //     this.balance = balance;
   // }

   // public String getCustumer_name() {
   //     return custumer_name;
   // }

   // public void setCustumer_name(String custumer_name) {
   //     this.custumer_name = custumer_name;
   // }

   // public String getCustume_email_address() {
   //     return custume_email_address;
   // }

   // public void setCustume_email_address(String custume_email_address) {
   //     this.custume_email_address = custume_email_address;
   // }

   // public String getCustumer_number() {
   //     return custumer_number;
   // }

   // public void setCustumer_number(String custumer_number) {
   //     this.custumer_number = custumer_number;

   private  String name;
   private  double credit_limit;
   private  String email_address;

   public Car() {
       this("default name",50000.00,"default@email.com");
   }

   public Car(String name, double credit_limit) {
       this(name,credit_limit,"unknow@email.com");
   }

   public Car(String name, double credit_limit, String email_address) {
       this.name = name;
       this.credit_limit = credit_limit;
       this.email_address = email_address;
   }

   public String getName() {
       return name;
   }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail_address() {
       return email_address;
    }
}
