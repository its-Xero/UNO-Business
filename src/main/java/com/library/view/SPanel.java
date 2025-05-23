package com.library.view;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class SPanel extends JPanel {
    private Color backgroundColor;
    private int cornerRadius;
    private boolean rounded;

    public SPanel() {
        this.cornerRadius = 20;
        setOpaque(false);
    }

    public SPanel(LayoutManager layout) {
        super(layout);
    }

    public SPanel(Color bgColor, boolean rounded) {
        this.backgroundColor = bgColor;
        this.rounded = rounded;
        this.cornerRadius = 20;
        setOpaque(false);
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if (rounded) {
            g2.setColor(backgroundColor);
            g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));
        } else {
            g2.setColor(backgroundColor);
            g2.fillRect(0, 0, getWidth(), getHeight());
        }
        
        g2.dispose();
    }
    
    // Factory methods for common panel types
    public static SPanel createPlayerPanel() {
        return new SPanel(new Color(255, 255, 255, 200), true);
    }
    
    public static SPanel createGameBoardPanel() {
        return new SPanel(new Color(245, 245, 245, 220), true);
    }
    
    public static SPanel createCardPanel() {
        return new SPanel(new Color(255, 255, 255), true);
    }
}