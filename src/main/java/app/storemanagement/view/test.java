/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app.storemanagement.view;


import javax.swing.*;
import javax.swing.text.*;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("No Number TextField Example");
        JTextField textField = new JTextField();
        
        // Create a DocumentFilter to block numeric input
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                    throws BadLocationException {
                // Allow only non-numeric characters to be inserted
                if (!containsNumber(string)) {
                    super.insertString(fb, offset, string, attr);
                }
            }
            
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                // Allow only non-numeric characters to be replaced
                if (!containsNumber(text)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
            
            private boolean containsNumber(String text) {
                return text.matches(".*\\d.*");
            }
        });
        
        frame.getContentPane().add(textField);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

