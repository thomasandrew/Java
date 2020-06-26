package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Example Frame");
        frame.setSize(500, 500);
        frame.setLayout(null);

        // JPanel
        /*JPanel panel = new JPanel(); // It's a small frame inside of a frame.
        panel.setLayout(null);
        panel.setBounds(5, 5, 400, 300);
        panel.setBackground(Color.BLACK); // Background color.

        JPanel panelTwo = new JPanel();
        panelTwo.setLayout(null);
        panelTwo.setBounds(5, 310, 450, 100);
        panelTwo.setBackground(Color.RED);

        frame.add(panel);
        frame.add(panelTwo);
        */

        //JTextField
        /*JTextField textField = new JTextField(); // I can write a string inside.
        textField.setBounds(5, 5, 300, 20);

        frame.add(textField);
        */

        //JTextArea
        /*JTextArea textArea = new JTextArea();
        textArea.setBounds(5, 5, 300, 200);

        frame.add(textArea);
        */

        //JScrollPane
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(5, 5, 300, 200);

        frame.add(scrollPane);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// JPanel
// JTextField
// JTextArea
// JScrollPane
