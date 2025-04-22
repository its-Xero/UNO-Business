import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class UnoButton extends JButton {
    private Color backgroundColor;
    private Color hoverColor;
    private Color pressedColor;
    private int cornerRadius;
    
    public UnoButton(String text, Color bgColor) {
        super(text);
        this.backgroundColor = bgColor;
        this.hoverColor = bgColor.brighter();
        this.pressedColor = bgColor.darker();
        this.cornerRadius = 25;
        
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        
        // Set preferred size for consistent button sizing
        setPreferredSize(new Dimension(120, 40));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if (getModel().isPressed()) {
            g2.setColor(pressedColor);
        } else if (getModel().isRollover()) {
            g2.setColor(hoverColor);
        } else {
            g2.setColor(backgroundColor);
        }
        
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));
        g2.dispose();
        
        super.paintComponent(g);
    }
    
    // Factory methods for common Uno button colors
    public static UnoButton createRedButton(String text) {
        return new UnoButton(text, new Color(211, 47, 47));
    }
    
    public static UnoButton createBlueButton(String text) {
        return new UnoButton(text, new Color(41, 98, 255));
    }
    
    public static UnoButton createGreenButton(String text) {
        return new UnoButton(text, new Color(56, 142, 60));
    }
    
    public static UnoButton createYellowButton(String text) {
        return new UnoButton(text, new Color(255, 238, 88));
    }
    
    public static UnoButton createWildButton(String text) {
        return new UnoButton(text, new Color(106, 27, 154)); // Purple for wild cards
    }
}