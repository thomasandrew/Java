package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        JFrame f = new JFrame("JLabel Example");
        f.setLayout(null);
        f.setSize(500, 300);

        /* JLabel
        JLabel labelOne = new JLabel("Testing JLabel");
        labelOne.setBounds(5, 5, 100, 30);

        f.add(labelOne);
        */

        // JList
        String[] listItems = {"1", "2", "3", "4", "5","6", "7", "8", "9", "10", "11", "12","13", "14"};
        JList list = new JList(listItems);
        //list.setBounds(5, 5 ,30, 200);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(5, 5 ,60, 200);

        f.add(scrollPane);

        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// JLabel
// JList

