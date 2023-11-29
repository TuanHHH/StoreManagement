/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app.storemanagement.view;

/**
 *
 * @author Tuan
 */
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class test2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("NumericTextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numericField = new JTextField();
        ((AbstractDocument) numericField.getDocument()).setDocumentFilter(new DocumentFilter(){

            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < text.length(); i++) {
                    if (Character.isDigit(text.charAt(i))) {
                        sb.append(text.charAt(i));
                    }
                }
                super.insertString(fb, offset, sb.toString(), attr);

            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < text.length(); i++) {
                    if (Character.isDigit(text.charAt(i))) {
                        sb.append(text.charAt(i));
                    }
                }
                super.replace(fb, offset, length, sb.toString(), attrs);
            }
        });

        frame.add(numericField, BorderLayout.NORTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}


