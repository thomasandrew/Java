package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        JFrame f = new JFrame("Example Frame");
        f.setLayout(null);
        f.setSize(500, 300);
        Container c = f.getContentPane();

        JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon("C:\\Users\\Thomas\\Learning java\\IntroToSwing\\src\\com\\company\\jj.jpg"));
        jLabel.setBounds(5, 5, 400, 300);

        f.add(jLabel);

        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//Image


