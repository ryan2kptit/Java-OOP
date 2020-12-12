/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing;

/**
 *
 * @author dong
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.util.*;
        
public class JFrameDemo extends JFrame{
    private JFrame frame;
    JButton button;
    
    public JFrameDemo(){
        createAndShow();
    }
    
    public void createAndShow(){
        button = new JButton("click");
       // frame = new JFrame("java swing");
        setSize(400,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
        this.setLayout(new FlowLayout());
        //frame.pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JFrameDemo();
    }
}
