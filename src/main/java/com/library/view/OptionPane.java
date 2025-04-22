import javax.swing.*;
import java.awt.*;

public class OptionPane {
    public static void showUnoMessageDialog(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, 
            "<html><div style='text-align: center;'><font face='Comic Sans MS' size='4' color='#0D47A1'>" + 
            message + "</font></div></html>", 
            "Uno Game", 
            JOptionPane.INFORMATION_MESSAGE,
            new ImageIcon("uno_icon.png"));
    }
    
    public static int showUnoConfirmDialog(Component parent, String message) {
        Object[] options = {"Yes", "No"};
        return JOptionPane.showOptionDialog(parent,
            "<html><div style='text-align: center;'><font face='Comic Sans MS' size='4' color='#0D47A1'>" + 
            message + "</font></div></html>",
            "Uno Game",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            new ImageIcon("uno_icon.png"),
            options,
            options[0]);
    }
    
    public static String showUnoInputDialog(Component parent, String message) {
        return JOptionPane.showInputDialog(parent,
            "<html><div style='text-align: center;'><font face='Comic Sans MS' size='4' color='#0D47A1'>" + 
            message + "</font></div></html>",
            "Uno Game",
            JOptionPane.PLAIN_MESSAGE,
            new ImageIcon("uno_icon.png"),
            null,
            null).toString();
    }
}