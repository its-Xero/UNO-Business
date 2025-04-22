import javax.swing.*;
import java.awt.*;
import com.library.view.Frame;
import com.library.view.Panel;
import com.library.view.Label;
import com.library.view.Button;
import com.library.view.CardDisplay;
import com.library.view.OptionPane;


public class UnoGameExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the main frame
            Frame frame = new Frame("Uno Game");
            
            // Create main panel with border layout
            Panel mainPanel = new Panel(new Color(13, 71, 161), false);
            mainPanel.setLayout(new BorderLayout(10, 10));
            
            // Add title
            mainPanel.add(Label.createTitleLabel("UNO GAME"), BorderLayout.NORTH);
            
            // Create game board panel
            Panel boardPanel = Panel.createGameBoardPanel();
            boardPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
            
            // Add some cards to the board
            boardPanel.add(new CardDisplay(Color.RED, "5"));
            boardPanel.add(new CardDisplay(Color.BLUE, "R"));
            boardPanel.add(new CardDisplay(Color.GREEN, "S"));
            boardPanel.add(new CardDisplay(Color.YELLOW, "W"));
            
            mainPanel.add(boardPanel, BorderLayout.CENTER);
            
            // Create control panel
            Panel controlPanel = Panel.createPlayerPanel();
            controlPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
            
            // Add buttons
            Button drawButton = Button.createWildButton("Draw Card");
            Button unoButton = Button.createRedButton("Say UNO!");
            Button passButton = Button.createBlueButton("Pass Turn");
            
            controlPanel.add(drawButton);
            controlPanel.add(unoButton);
            controlPanel.add(passButton);
            
            mainPanel.add(controlPanel, BorderLayout.SOUTH);
            
            // Add action listeners
            drawButton.addActionListener(_ -> OptionPane.showUnoMessageDialog(frame, "You drew a card!"));
            
            unoButton.addActionListener(_ -> {
                int response = OptionPane.showUnoConfirmDialog(frame, "Are you sure you want to say UNO?");
                if (response == JOptionPane.YES_OPTION) {
                    OptionPane.showUnoMessageDialog(frame, "UNO!");
                }
            });
            
            // Set content and show frame
            frame.setContentPane(mainPanel);
            frame.setVisible(true);
        });
    }
}