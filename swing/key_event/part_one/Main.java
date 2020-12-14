package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new FlowLayout());
        JTextField field = new JTextField(20);
        field.addKeyListener(new Practise2());
        panel.add(field);
        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
