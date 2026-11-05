/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmenu;

/**
 *
 * @author travislixx
 */

// Import Swing components for creating the GUI
import javax.swing.*;

// Import WildlifeUI from the marinewildlife package
import marinewildlife.WildlifeUI;

// MainMenu class inherits from JFrame to create a window
public class MainMenu extends JFrame {

    // Declare buttons for the three OceanGuard sections
    private JButton btnPollution;
    private JButton btnWildlife;
    private JButton btnFishing;

    // Constructor: creates the OceanGuard main menu
    public MainMenu() {

        // Set the title of the application window
        setTitle("OceanGuard");

        // Set the window width and height
        setSize(450, 350);

        // Close the application when the main menu is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window in the centre of the screen
        setLocationRelativeTo(null);

        // Create a label to display the application title
        JLabel title = new JLabel("OceanGuard", SwingConstants.CENTER);

        // Set the font style, size and weight of the title
        title.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 28));

        // Create buttons for the three project sections
        btnPollution = new JButton("Marine Pollution Management");
        btnWildlife = new JButton("Marine Wildlife Conservation");
        btnFishing = new JButton("Sustainable Fishing Management");

        // Create a panel to hold the title and buttons
        JPanel panel = new JPanel();

        // Arrange the components vertically
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Centre the title and buttons horizontally
        title.setAlignmentX(CENTER_ALIGNMENT);
        btnPollution.setAlignmentX(CENTER_ALIGNMENT);
        btnWildlife.setAlignmentX(CENTER_ALIGNMENT);
        btnFishing.setAlignmentX(CENTER_ALIGNMENT);

        // Add spacing and components to the panel
        panel.add(Box.createVerticalStrut(40));
        panel.add(title);
        panel.add(Box.createVerticalStrut(30));
        panel.add(btnPollution);
        panel.add(Box.createVerticalStrut(15));
        panel.add(btnWildlife);
        panel.add(Box.createVerticalStrut(15));
        panel.add(btnFishing);

        // Add the panel to the main window
        add(panel);

        // Add an action listener to the Wildlife button
        btnWildlife.addActionListener(e -> {

            // Create and display the WildlifeUI window
            new WildlifeUI().setVisible(true);

            // Close the main menu window
            this.dispose();
        });
    }

    // Method reserved for opening the Pollution section later
    public void openPollution() {
        // Connect Member 1's section later
    }

    // Method to open the Wildlife section
    public void openWildlife() {

        // Create and display the WildlifeUI window
        new WildlifeUI().setVisible(true);

        // Close the main menu window
        this.dispose();
    }

    // Method reserved for opening the Fishing section later
    public void openFishing() {
        // Connect Member 3's section later
    }
}