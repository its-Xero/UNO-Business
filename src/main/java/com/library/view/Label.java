import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    public Label(String text) {
        super(text);
        setForeground(Color.WHITE);
        setFont(new Font("Comic Sans MS", Font.BOLD, 18));
    }
    
    public Label(String text, Color color, int fontSize) {
        super(text);
        setForeground(color);
        setFont(new Font("Comic Sans MS", Font.BOLD, fontSize));
    }
    
    // Factory methods for common label types
    public static Label createTitleLabel(String text) {
        Label label = new Label(text, Color.YELLOW, 28);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
        return label;
    }
    
    public static Label createPlayerLabel(String text) {
        return new Label(text, Color.BLACK, 16);
    }
    
    public static Label createScoreLabel(String text) {
        Label label = new Label(text, Color.WHITE, 20);
        label.setFont(label.getFont().deriveFont(Font.BOLD));
        return label;
    }
}