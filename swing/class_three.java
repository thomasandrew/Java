package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Example JMenuBar");
        frame.setLayout(new BorderLayout()); // BorderLayout
        frame.setSize(500, 300);

        JMenuBar menuBar = new JMenuBar();
        JMenu optionOne = new JMenu("Option 1");
        JMenuItem optionOneA = new JMenuItem("Option 1");
        JMenuItem optionTwoA = new JMenuItem("Option 2");
        JMenu optionTwo = new JMenu("Option 2");
        JCheckBoxMenuItem optionUno = new JCheckBoxMenuItem("Option 1");
        JRadioButtonMenuItem optionDos = new JRadioButtonMenuItem("Option 2");
        JMenu optionThree = new JMenu("Option3");
        JMenu optionThreeOptionOne = new JMenu("Option 3 Option 1");

        frame.add(menuBar, BorderLayout.NORTH);
        menuBar.add(optionOne);
        optionOne.add(optionOneA);
        optionOne.add(optionTwoA);
        menuBar.add(optionTwo);
        optionTwo.add(optionUno);
        optionTwo.add(optionDos);
        menuBar.add(optionThree);
        optionThree.add(optionThreeOptionOne);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// JMenuBar
// BorderLayout
// JMenu
// JCheckBoxMenuItem
// JRadioButttonMenuItem
