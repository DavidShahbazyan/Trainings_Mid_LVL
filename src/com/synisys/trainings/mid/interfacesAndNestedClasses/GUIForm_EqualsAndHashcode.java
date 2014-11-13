package com.synisys.trainings.mid.interfacesAndNestedClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author David.Shahbazyan
 * @since Nov 12, 2014.
 */
public class GUIForm_EqualsAndHashcode extends JFrame {
    private JTextField obj1_id;
    private JTextField obj2_id;
    private JTextArea obj1_text;
    private JTextArea obj2_text;
    private JLabel obj1_hashcode;
    private JLabel obj2_hashcode;
    private JButton generateHashes;
    private JButton checkEquality;

    private Obj obj1;
    private Obj obj2;


    public GUIForm_EqualsAndHashcode(String title) throws HeadlessException {
        super(title);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(0, 2, 15, 0));
        getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setPreferredSize(new Dimension(400, 250));

        initForm();
        initListeners();
    }

    private void initForm() {
        int fieldWidth = 100;
        int fieldHeight = 50;

        obj1 = new Obj();
        obj2 = new Obj();

        JPanel obj1_Panel = new JPanel(new GridLayout(0, 2));
        JPanel obj2_Panel = new JPanel(new GridLayout(0, 2));

        obj1_id = new JTextField(obj1.id);
        obj1_id.setPreferredSize(new Dimension(fieldWidth, 24));
        obj2_id = new JTextField(obj2.id);
        obj2_id.setPreferredSize(new Dimension(fieldWidth, 24));

        obj1_text = new JTextArea(obj1.text);
        obj1_text.setPreferredSize(new Dimension(fieldWidth, fieldHeight));
        obj2_text = new JTextArea(obj2.text);
        obj2_text.setPreferredSize(new Dimension(fieldWidth, fieldHeight));

        obj1_hashcode = new JLabel();
        obj2_hashcode = new JLabel();

        generateHashes = new JButton("Generate Hash Codes");
        checkEquality = new JButton("Check equality");

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

    private void initListeners() {
        generateHashes.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj1.setId(obj1_id.getText());
                obj2.setId(obj2_id.getText());
                obj1_hashcode.setText(String.valueOf(obj1.hashCode()));
                obj2_hashcode.setText(String.valueOf(obj2.hashCode()));
                revalidate();
            }
        });

        checkEquality.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj1.setId(obj1_id.getText());
                obj2.setId(obj2_id.getText());
                obj1.setText(obj1_text.getText());
                obj2.setText(obj2_text.getText());
                boolean result = obj1.equals(obj2);
                JOptionPane.showMessageDialog(GUIForm_EqualsAndHashcode.this, result, "Equality results", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }

    public void display() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class Obj {
        private String id;
        private String text;

        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }
        public void setText(String text) {
            this.text = text;
        }

        @Override
        public int hashCode() {
            int result = 17;
            char[] charArray = id.toCharArray();
            for (char c : charArray) {
                result = 31 * result + String.valueOf(c).codePointAt(0);
            }
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj2) {
                return true;
            } else if (!(obj instanveof Obj)) {
                return false;
            } else {
                Obj that = (Obj) obj;
                return this.id.equals(that.getId()) && this.text.equals(that.getText());
            }
        }
    }

}
