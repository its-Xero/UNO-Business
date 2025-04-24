package com.library.view;

import javax.swing.*;
import java.awt.*;

public class CardDisplay extends JPanel {
    private final String value;
    private final Color color;

    public CardDisplay(Color color, String value) {
        this.color = color;
        this.value = value;
        setPreferredSize(new Dimension(70, 110));
        setBackground(color);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setLayout(new BorderLayout());

        JLabel valueLabel = new JLabel(value, JLabel.CENTER);
        valueLabel.setFont(new Font("Arial", Font.BOLD, 24));
        valueLabel.setForeground(Color.WHITE);
        add(valueLabel, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Add card decoration
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw rounded corners
        g2d.setColor(color);
        g2d.fillRoundRect(3, 3, getWidth() - 6, getHeight() - 6, 15, 15);

        // Draw oval in middle of card
        g2d.setColor(new Color(255, 255, 255, 60));
        g2d.fillOval(getWidth()/4, getHeight()/3, getWidth()/2, getHeight()/3);
    }
}