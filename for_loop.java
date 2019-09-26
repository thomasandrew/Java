package com.company;

public class Main {

    public static void main(String[] args) {

        //check the challenge again

        System.out.println("10,000 at 2% interest = "+calculateinterest(10000.0,2.0));
        System.out.println("10,000 at 3% interest = "+calculateinterest(10000.0,3.0));
        System.out.println("10,000 at 4% interest = "+calculateinterest(10000.0,4.0));
        System.out.println("10,000 at 5% interest = "+calculateinterest(10000.0,5.0));

        for(int i=0; i<=5; i++) {
            System.out.println("Loop "+ i +" hello!");
        }

        for(int i=2; i<=8; i++) {
            System.out.println("10,000 at "+i+"%"+ " interest = "+String.format("%.2f",calculateinterest(10000.0,i)));/*i can cast (double) if i want to*/ // i can use String.format("%.2f") to decrease the nomber 0 from a double variable.
        }

        System.out.println("*******************");

        for(int i=8;i>=2;i--) {
            System.out.println("10,000 at "+i+"%"+ " interest = "+String.format("%.2f",calculateinterest(10000.0,i)));
        }

        System.out.println("*******************");

        long count = 0;

        for(int i=10; i<50; i++) {// it can be how many i want to.

        if(isprime(i)) {
            count++;
            System.out.println("Number "+ i +" is prime number");

            if(count == 10) {
                System.out.println("Existing for loop");
                break;
            }

        }

        }
    }

    public static boolean isprime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i<=n/2; i++) {//i<=Math.sqrt(n);i++
            System.out.println("Looping "+i);
            if(n %  i == 0) {
                return false;
            }
        }

       return true;
    }

    public static double calculateinterest(double amount, double interestrate) {

        return (amount * (interestrate/100));



    }

}
