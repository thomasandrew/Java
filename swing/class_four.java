package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        JFrame f = new JFrame("JTabbedPane Example");
        f.setLayout(new BorderLayout());
        f.setSize(500, 300);

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel one = new JPanel();
        tabbedPane.addTab("Tab 1", one);
        JPanel two = new JPanel();
        tabbedPane.addTab("Tab 2", two);
        JPanel three = new JPanel();
        tabbedPane.addTab("Tab 3", three);

        f.add(tabbedPane);

        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// JTabbedPane
