/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingen;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ldcha
 */
public class PinGen extends JFrame {

    public JTextField insText = new JTextField("Keep your accounts secure");
    public JTextField resultText = new JTextField(15);
    public JLabel pinLabel = new JLabel("PIN: ");
    public JButton generateButton = new JButton("Generate Random PIN");

    public PinGen() {
        JFrame frame = new JFrame("Pin Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set Font
        Font f = new Font("Roboto", Font.PLAIN, 30);
        //create panels
        //create buttonPanel
        JPanel buttonPanel = new JPanel();
        //instruction panel
        JPanel insPanel = new JPanel();
        //create resultPanel
        JPanel resultPanel = new JPanel();
        
        insPanel.add(insText);
        insText.setEditable(false);
        
        buttonPanel.add(generateButton);
        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Generate gen = new Generate();
                String result ="";
                result = gen.thePin();
                resultText.setText(result);
            }
            });

        resultPanel.add(pinLabel);
        resultPanel.add(resultText);
        resultText.setEditable(false);

        frame.add(insPanel);
        frame.add(buttonPanel);
        frame.add(resultPanel);

        insText.setFont(f);
        insText.repaint();
        generateButton.setFont(f);
        generateButton.repaint();
        resultText.setFont(f);
        resultText.repaint();
        pinLabel.setFont(f);
        pinLabel.repaint();

        frame.add(insPanel, BorderLayout.PAGE_START);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(resultPanel, BorderLayout.SOUTH);
        frame.setSize(900, 250);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        PinGen pingen = new PinGen();
    }
}
