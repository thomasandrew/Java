package com.company;

public class Car {

   private String firstName;
   private String lastName;
   private int age;

   public String getFirstName() {
       return firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public int getAge() {
       return age;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public void setAge(int age) {
       this.age = (age < 0 || age > 100) ? 0 : age;
   }

   public boolean isTeen() {
       return (this.getAge() > 12 && this.getAge() < 20) ? true : false;
   }

   public String getFullName() {

       String full;

       if (this.getFirstName().isEmpty() && this.getLastName().isEmpty()) {
           full =  "";
       } else if (this.getLastName().isEmpty()) {
           full =  this.getFirstName();
       } else if (this.getFirstName().isEmpty()) {
           full =  this.getLastName();
       } else {
           full = this.getFirstName() + " " + this.getLastName();
       }

       return full;
   }

}
