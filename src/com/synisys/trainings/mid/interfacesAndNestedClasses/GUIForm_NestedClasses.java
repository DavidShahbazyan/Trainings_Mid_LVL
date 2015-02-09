package com.synisys.trainings.mid.interfacesAndNestedClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public class GUIForm_NestedClasses extends JFrame {
    private String message;

    public GUIForm_NestedClasses(final String title) throws HeadlessException {
        super(title);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(0, 1));
        setPreferredSize(new Dimension(300, 100));

        JButton clickMeButton = new JButton("Click Me!");
        JButton newWindowButton = new JButton("New window.");

        final Counter counter = new Counter();

        // Implementation of anonymous nested class
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = MESSAGES.CANT_BELIEVE.getText() + "\nYou clicked me " + counter.increment() + (counter.currentState() < 2 ? " time" : " times");
                JOptionPane.showMessageDialog(GUIForm_NestedClasses.this, message, MESSAGES.DIALOG_TITLE.getText(), JOptionPane.PLAIN_MESSAGE);
            }
        });

        newWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.createNewNestedClassesGUIForm();
            }
        });

        add(clickMeButton);
        add(newWindowButton);
    }

    public void display() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Implementation of public static nested class
    enum MESSAGES {
        DIALOG_TITLE("Uoops (o.0)"),
        CANT_BELIEVE("I can't believe!")
        ;

        private String text;

        MESSAGES(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    // Implementation of non static nested class
    private class Counter {
        private int counter;

        public int increment() {
            return ++counter;
        }
        public int decrement() {
            return --counter;
        }
        public int currentState() { return counter; }
    }
}
