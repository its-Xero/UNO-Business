import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class UnoCardComponent extends JComponent {
    private Color cardColor;
    private String cardValue;
    private boolean selected;
    
    public UnoCardComponent(Color color, String value) {
        this.cardColor = color;
        this.cardValue = value;
        this.selected = false;
        setPreferredSize(new Dimension(80, 120));
    }
    
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Draw card background
        if (selected) {
            g2.setColor(cardColor.brighter());
        } else {
            g2.setColor(cardColor);
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        
        // Draw card border
        g2.setColor(Color.BLACK);
        g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
        
        // Draw card value
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        
        FontMetrics fm = g2.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(cardValue)) / 2;
        int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
        
        g2.drawString(cardValue, x, y);
        
        // Draw small value in corner
        g2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        g2.drawString(cardValue, 5, 15);
    }
}