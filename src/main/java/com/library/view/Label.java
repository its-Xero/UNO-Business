import javax.swing.*;
import java.awt.*;

public class UnoLabel extends JLabel {
    public UnoLabel(String text) {
        super(text);
        setForeground(Color.WHITE);
        setFont(new Font("Comic Sans MS", Font.BOLD, 18));
    }
    
    public UnoLabel(String text, Color color, int fontSize) {
        super(text);
        setForeground(color);
        setFont(new Font("Comic Sans MS", Font.BOLD, fontSize));
    }
    
    // Factory methods for common label types
    public static UnoLabel createTitleLabel(String text) {
        UnoLabel label = new UnoLabel(text, Color.YELLOW, 28);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
        return label;
    }
    
    public static UnoLabel createPlayerLabel(String text) {
        return new UnoLabel(text, Color.BLACK, 16);
    }
    
    public static UnoLabel createScoreLabel(String text) {
        UnoLabel label = new UnoLabel(text, Color.WHITE, 20);
        label.setFont(label.getFont().deriveFont(Font.BOLD));
        return label;
    }
}