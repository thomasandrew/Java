package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print("[?]");
                } else if (matrix[i][j] == 2) {
                    System.out.print("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                } else if (matrix[i][j] == 3) {
                    System.out.print("Hi");
                } else if (matrix[i][j] == 0){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
