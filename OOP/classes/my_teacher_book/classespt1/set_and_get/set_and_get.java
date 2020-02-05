package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       Car mygradebook = new Car();

       System.out.printf("Initial course name name is: %s\n\n",mygradebook.getCourseName());

       System.out.println("Please enter the course name");
       String theName = input.nextLine();
       mygradebook.setCoursename(theName); // Configura o nome do curso (Variavel).
       System.out.println();

       mygradebook.displayMessage();

    }
}


