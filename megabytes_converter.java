package com.company;

public class Main {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megabytes = kiloBytes / 1024;
        int remaining_kilobytes = kiloBytes % 1024;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remaining_kilobytes + " KB");
        }
    }
}
