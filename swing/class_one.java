package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example frase name");
        frame.setLayout(null);
        frame.setSize(500, 200); // Width and Height.

        JButton buttonOne = new JButton("Press Me");
        buttonOne.setBounds(5, 5, 100, 20); // x: over, y: Down, width, height.
        JButton buttonTwo = new JButton("Press Me TOO!");
        buttonTwo.setBounds(5, 30, 130, 20);

        frame.add(buttonOne); // To add.
        frame.add(buttonTwo);

        frame.setVisible(true); // To the frame to be visible.
        //frame.setLocation(250, 250); // 250 up and 250 down (Optional)
        frame.setLocationRelativeTo(null); // To put in the middle. (Optional)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To close program.
    }
}
