package com.synisys.trainings.mid.interfacesAndNestedClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public class GUIForm_AnonymousInnerClass extends JFrame {
    private static int counter;
    private String message;

    public GUIForm_AnonymousInnerClass(String title) throws HeadlessException {
        super(title);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 70));

        JButton clickMeButton = new JButton("Click Me!");

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = "I can't believe!\nYou clicked me " + String.valueOf(++counter) + (counter < 2 ? " time" : " times");
                JOptionPane.showMessageDialog(GUIForm_AnonymousInnerClass.this, message, "Uoops", JOptionPane.PLAIN_MESSAGE);
            }
        });

        add(clickMeButton);
    }

    public void display() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
