package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        JFrame f = new JFrame("Example Frame");
        f.setLayout(null);
        f.setSize(500, 300);

       /*
        JRadioButton radioButtonOne = new JRadioButton("Button 1");
        radioButtonOne.setBounds(5, 5, 100, 30);
        radioButtonOne.setSelected(true); // To stay selected.
        JRadioButton radioButtonTwo = new JRadioButton("Button 2");
        radioButtonTwo.setBounds(5, 40, 100, 30);
        JRadioButton radioButtonThree = new JRadioButton("Button 3");
        radioButtonThree.setBounds(5, 75, 100, 30);

        ButtonGroup group = new ButtonGroup(); // To group the buttons.
        group.add(radioButtonOne);
        group.add(radioButtonTwo);
        group.add(radioButtonThree);

        f.add(radioButtonOne);
        f.add(radioButtonTwo);
        f.add(radioButtonThree);
        */

        JCheckBox checkBoxOne = new JCheckBox("Button 1");
        checkBoxOne.setBounds(5, 5, 100, 30);
        JCheckBox checkBoxTwo = new JCheckBox("Button 2");
        checkBoxTwo.setBounds(5, 40, 100, 30);
        JCheckBox checkBoxThree = new JCheckBox("Button 3");
        checkBoxThree.setBounds(5, 75, 100, 30);

        f.add(checkBoxOne);
        f.add(checkBoxTwo);
        f.add(checkBoxThree);

        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//LRadioButton / ButtonGroup / .setSelected(true) / JCheckBox


