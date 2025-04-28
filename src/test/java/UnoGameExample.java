import javax.swing.*;
import java.awt.*;
import com.library.view.SFrame;
import com.library.view.SPanel;
import com.library.view.RLabel;
import com.library.view.UButton;
import com.library.view.CardDisplay;
import com.library.view.ROptionPane;


public class UnoGameExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the main frame
            SFrame frame = new SFrame("Uno Game");
            
            // Create main panel with border layout
            SPanel mainPanel = new SPanel(new Color(24, 82, 181), false);
            mainPanel.setLayout(new BorderLayout(10, 10));
            
            // Add title
            mainPanel.add(RLabel.createTitleLabel("UNO GAME"), BorderLayout.NORTH);
            
            // Create game board panel
            SPanel boardPanel = SPanel.createGameBoardPanel();
            boardPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
            
            // Add some cards to the board
            boardPanel.add(new CardDisplay(Color.RED, "5"));
            boardPanel.add(new CardDisplay(Color.BLUE, "R"));
            boardPanel.add(new CardDisplay(Color.GREEN, "S"));
            boardPanel.add(new CardDisplay(Color.YELLOW, "W"));
            
            mainPanel.add(boardPanel, BorderLayout.CENTER);
            
            // Create control panel
            SPanel controlPanel = SPanel.createPlayerPanel();
            controlPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
            
            // Add buttons
            UButton drawButton = UButton.createWildButton("Draw Card");
            UButton passButton = UButton.createBlueButton("Pass Turn");
            
            controlPanel.add(drawButton);
            controlPanel.add(passButton);
            
            mainPanel.add(controlPanel, BorderLayout.SOUTH);
            
            // Add action listeners
            drawButton.addActionListener(_ -> ROptionPane.showUnoMessageDialog(frame, "You drew a card!"));

            
            // Set content and show frame
            frame.setContentPane(mainPanel);
            frame.setVisible(true);
        });
    }
}