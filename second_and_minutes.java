package com.company;

public class Main {

    private static final String INVALID_VALUE_MASSAGE = "Invalid value";//constants

    public static void main(String[] args) {

        System.out.println(getdurationstring(65,45));
        System.out.println(getdurationstring(3945L));
        System.out.println(getdurationstring(-41L));
        System.out.println(getdurationstring(65,9));

    }


    public static String getdurationstring(long minutes, long seconds) {

        long hours = 0;

        if ((minutes < 0) && (seconds < 0) && (seconds > 59)) {
            // return "Invalid value";
            return INVALID_VALUE_MASSAGE;
        }

            hours = minutes/60;
            long remainingminutes= minutes % 60;

            String hourstring = hours + "h";
            if(hours < 10) {
                hourstring = "0" + hourstring;
            }

            String minutesstring = remainingminutes + "m";
            if(remainingminutes < 10) {
                minutesstring = "0" + minutesstring;
            }

            String secondsstring = seconds + "s";
            if(seconds < 10) {
                secondsstring = "0" + secondsstring;
            }
            //System.out.println(hours + "h" + remainingminutes + "m" + seconds + "s");
            System.out.println(hourstring + " " + minutesstring + " " + secondsstring + " ");

        return "Invalid value";
    }

    public static String getdurationstring(long seconds) {

        long minutes=0;

         if(seconds < 0) {

             //return "Invalid value";
             return INVALID_VALUE_MASSAGE;
         }

         minutes = seconds/60;
         long remainingseconds = seconds % 60;

         return getdurationstring(minutes,remainingseconds);
    }
}


