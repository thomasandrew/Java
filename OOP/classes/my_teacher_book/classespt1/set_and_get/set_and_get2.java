package com.company;

public class Car {

    private String courseName;

    public void setCoursename(String name) {
        courseName = name; // Armazena o nome do curse (Variavel).
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for\n%s!\n",getCourseName());
    }

}
