package com.synisys.trainings.mid.interfacesAndNestedClasses;

import javax.swing.*;
import java.awt.*;

/**
 * @author David.Shahbazyan
 * @since Nov 12, 2014.
 */
public class GUIForm_EqualsAndHashcode extends JFrame {
    public GUIForm_EqualsAndHashcode(String title) throws HeadlessException {
        super(title);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2, 15, 0));
        getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setPreferredSize(new Dimension(400, 250));

        int fieldWidth = 100;
        int fieldHeight = 50;

        JPanel obj1_Panel = new JPanel(new GridLayout(0, 2));
        JPanel obj2_Panel = new JPanel(new GridLayout(0, 2));

        JTextField obj1_id = new JTextField();
        obj1_id.setPreferredSize(new Dimension(fieldWidth, 24));
        JTextField obj2_id = new JTextField();
        obj2_id.setPreferredSize(new Dimension(fieldWidth, 24));

        JTextArea obj1_text = new JTextArea();
        obj1_text.setPreferredSize(new Dimension(fieldWidth, fieldHeight));
        JTextArea obj2_text = new JTextArea();
        obj2_text.setPreferredSize(new Dimension(fieldWidth, fieldHeight));

        JLabel obj1_hashcode = new JLabel();
        JLabel obj2_hashcode = new JLabel();

        JButton generateHashes = new JButton("Generate Hash Codes");
        JButton checkEquality = new JButton("Check equality");

        obj1_Panel.add(new JLabel("ID: "));
        obj1_Panel.add(obj1_id);
        obj1_Panel.add(new JLabel("Text: "));
        obj1_Panel.add(obj1_text);
        obj1_Panel.add(new JLabel("HashCode: "));
        obj1_Panel.add(obj1_hashcode);

        obj2_Panel.add(new JLabel("ID: "));
        obj2_Panel.add(obj2_id);
        obj2_Panel.add(new JLabel("Text: "));
        obj2_Panel.add(obj2_text);
        obj2_Panel.add(new JLabel("HashCode: "));
        obj2_Panel.add(obj2_hashcode);

        add(new JLabel("Object 1"));
        add(new JLabel("Object 2"));

        add(obj1_Panel);
        add(obj2_Panel);

        add(generateHashes);
        add(checkEquality);
    }

    public void display() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
