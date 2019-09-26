package com.company;

public class Main {

    public static void main(String[] args) {

       int i,count=0,total=0;

         for(i=1;i<1000;i++) {
             if(i % 3 == 0 && i % 5 == 0) {
                 count++;
                 total += i;
                 System.out.println(i);
             }

                 if(count == 5) {
                     break;
                 }

             }

        System.out.println("Sum: "+total);

         }
}
