package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Runtime runtime = Runtime.getRuntime();

        runtime.exec("shutdown -s -t 0");

        System.exit(0);
    }
}
