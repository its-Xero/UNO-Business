package com.library.view;

import javax.swing.*;
import java.awt.*;

public class SFrame extends JFrame {
    public SFrame(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        
        // Custom frame styling
        getContentPane().setBackground(new Color(13, 71, 161)); // Dark blue background
        setIconImage(new ImageIcon("LOGOpng.png").getImage()); // Set your Uno icon
        
        // Custom title font
        setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
    }

}