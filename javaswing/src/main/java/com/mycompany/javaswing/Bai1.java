/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author dong
 */
public class Bai1 extends JFrame{

    public Bai1(String title) throws HeadlessException {
        super(title);
        initUI();
    }
    
    private void initUI(){
        this.setSize(700,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pnBorderLayout = new JPanel(new BorderLayout(5,5));
        
        
        // tao cung NOrth
        JPanel pnNorth = new JPanel();
        JLabel lblTitle = new JLabel("Giai phuong trinh bac 2");
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 32));
        pnNorth.setBackground(Color.GREEN);
        pnNorth.add(lblTitle);
        pnBorderLayout.add(pnNorth, BorderLayout.NORTH);
        // ket thuc North
        
        // tao cung Center
        JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
       Border borderCenter = BorderFactory.createLineBorder(Color.ORANGE);
       TitledBorder tileBorderCenter = new TitledBorder(borderCenter, "Nhap a, b, c");
       pnCenter.setBorder(tileBorderCenter);
       JPanel pnA = new JPanel();
       pnA.add(new JLabel("a: "));
       pnA.add(new JTextField(20));
       JPanel pnB = new JPanel();
       pnB.add(new JLabel("b: "));
       pnB.add(new JTextField(20));
       JPanel pnC = new JPanel();
       pnC.add(new JLabel("c: "));
       pnC.add(new JTextField(20));
       pnCenter.add(pnA);
       pnCenter.add(pnB);
       pnCenter.add(pnC);
       JPanel pnTextKQ = new JPanel();
       pnTextKQ.add(new JLabel("ket qua"));
       pnCenter.add(pnTextKQ);
       JPanel pnKQ = new  JPanel();
       JTextField txtKQ = new JTextField(20);
       pnKQ.add(txtKQ);
       pnCenter.add(pnKQ);
       pnBorderLayout.add(pnCenter, BorderLayout.CENTER);
        
        
        
        
        
        // tao South
        JPanel pnSouth = new JPanel();
        // tao duong vien
        Border borderSouth = BorderFactory.createLineBorder(Color.red);
        TitledBorder titleBorderSouth = new TitledBorder(borderSouth, "chon chuc nang");
        pnSouth.setBorder(titleBorderSouth);
        JButton btnGiai = new JButton("Giai");
        JButton btnXoa = new JButton("Xoa");
        JButton btnThoat = new JButton("Thoat");
        pnSouth.add(btnGiai);
        pnSouth.add(btnXoa);
        pnSouth.add(btnThoat);
        pnBorderLayout.add(pnSouth, BorderLayout.SOUTH);
        
        
        // dua vao frame
        this.add(pnBorderLayout);
        
    }
    public static void main(String[] args) {
        new Bai1("Giai phuong trinh bac 2").setVisible(true);
    }
    
}
