package com.library.view;

import javax.swing.*;
import java.awt.*;

public class RLabel extends JLabel {
    public RLabel(String text) {
        super(text);
        setForeground(Color.WHITE);
        setFont(new Font("Comic Sans MS", Font.BOLD, 18));
    }
    
    public RLabel(String text, Color color, int fontSize) {
        super(text);
        setForeground(color);
        setFont(new Font("Comic Sans MS", Font.BOLD, fontSize));
    }

    public RLabel(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    // Factory methods for common label types
    public static RLabel createTitleLabel(String text) {
        RLabel label = new RLabel(text, Color.YELLOW, 28);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
        return label;
    }
    
    public static RLabel createPlayerLabel(String text) {
        return new RLabel(text, Color.BLACK, 16);
    }
    
    public static RLabel createScoreLabel(String text) {
        RLabel label = new RLabel(text, Color.WHITE, 20);
        label.setFont(label.getFont().deriveFont(Font.BOLD));
        return label;
    }
}