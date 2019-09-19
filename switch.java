package com.company;

public class Main {

    private static final String not = "Not found";

    public static void main(String[] args) {

        int switch_value = 3;

        //The switch statement can be used just only with byte, short, char and int

        switch(switch_value) {

            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was: "+switch_value);
                break;

            default:
                System.out.println("Was not 1,2,3, 4 or 5");
                break;
        }

        //challenge

        char switch_now = 'E';

        switch(switch_now) {

            case 'A':
                System.out.println("It is: "+switch_now);
                break;

            case 'B':
                System.out.println("It is: "+switch_now);
                break;

            case 'C': case 'D': case 'E':
                System.out.println("It is: "+switch_now);
                break;

            default:
                System.out.println(not);
                break;
        }

        String month = "JANUARy";

        switch(month.toUpperCase()) {// to text if everything is with toLowerCase() or toUpperCase().

            case "JANUARY":
                System.out.println("jan");
                break;

            case "june":
                System.out.println("jun");
                break;

            default:
                System.out.println("Not sure");
                break;

        }
    }
}
