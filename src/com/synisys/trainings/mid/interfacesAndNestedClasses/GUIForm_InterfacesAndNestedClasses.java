package com.synisys.trainings.mid.interfacesAndNestedClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author David Shahbazyan
 * @since 12.11.2014.
 */
public class GUIForm_InterfacesAndNestedClasses extends JFrame {
    public GUIForm_InterfacesAndNestedClasses() throws HeadlessException {
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 1));
        setPreferredSize(new Dimension(300, 100));

        JButton equalsAndHashcode = new JButton("Equals and Hashcode Template");
        JButton nestedClasses = new JButton("Nested Classes Template");

        equalsAndHashcode.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.createNewEqualsAndHashcodeGUIForm();
            }
        });

        nestedClasses.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.createNewNestedClassesGUIForm();
            }
        });

        add(equalsAndHashcode);
        add(nestedClasses);
    }

    public void display() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
