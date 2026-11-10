/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmenu;

/**
 *
 * @author Soe
 */


import javax.swing.*;
import java.awt.*;

// Import the WildlifeUI class from the marinewildlife package
import marinewildlife.WildlifeUI;
public class MainMenu extends JFrame {

    // Declare objects
    private JLabel title;
    private JPanel panel;
    private JButton btnPollution;
    private JButton btnWildlife;
    private JButton btnFishing;
    private JButton btnExit;
    
    // creating a new object
    WildlifeUI wildlife = new WildlifeUI();

    
    public MainMenu() {
        
        setTitle("OceanGuard");  // Set the title of the application window
        setSize(500, 500); // Set the window width and height       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the main menu is closed      
        setLocationRelativeTo(null); // Display the window in the centre of the screen
        
        panel = new JPanel();
        //panel.setLayout(null);   
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));// Arrange the components vertically
        // panel.setBackground(Color.GRAY);
        add(panel); // Add the panel to the main window
    
        // Create title
        title = new JLabel("OceanGuard Application");
        title.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 45));
        //title.setBounds(75, 40, 350, 80);
        //panel.add(title);

        // Create buttons
        btnPollution = new JButton("Marine Pollution Management");
        btnPollution.setPreferredSize(new Dimension(350, 80));
        btnPollution.setMaximumSize(new Dimension(350, 80));
        //btnPollution.setBounds(100, 150, 300, 80);       
        //panel.add(btnPollution);

        btnWildlife = new JButton("Marine Wildlife Conservation");
        btnWildlife.setPreferredSize(new Dimension(350, 80));
        btnWildlife.setMaximumSize(new Dimension(350, 80));
        //btnWildlife.setBounds(100, 250, 300, 80);
        //panel.add(btnWildlife);

        btnFishing = new JButton("Sustainable Fishing Management");
        btnFishing.setPreferredSize(new Dimension(350, 80));
        btnFishing.setMaximumSize(new Dimension(350, 80));
        //btnFishing.setBounds(100, 350, 300, 80);
        //panel.add(btnFishing);
        
        btnExit = new JButton("Exit");
        btnExit.setPreferredSize(new Dimension(200, 50));
        btnExit.setMaximumSize(new Dimension(200, 50));
        
        
        // Centre components horizontally
        title.setAlignmentX(CENTER_ALIGNMENT);
        btnPollution.setAlignmentX(CENTER_ALIGNMENT);
        btnWildlife.setAlignmentX(CENTER_ALIGNMENT);
        btnFishing.setAlignmentX(CENTER_ALIGNMENT);
        btnExit.setAlignmentX(CENTER_ALIGNMENT);

        // Add spacing and components to the panel
        // Add 30 pixels of vertical spacing above the title
        panel.add(Box.createVerticalStrut(30));
        panel.add(title);
        panel.add(Box.createVerticalStrut(30)); // Add 30 pixels of vertical spacing below the title
        
        
        panel.add(Box.createVerticalStrut(30));
        panel.add(btnPollution);
        
        panel.add(Box.createVerticalStrut(15));
        panel.add(btnWildlife);
        
        panel.add(Box.createVerticalStrut(15));
        panel.add(btnFishing);
        
        panel.add(Box.createVerticalStrut(20));
        panel.add(btnExit);
        
        panel.add(Box.createVerticalStrut(30)); 

        
        
        // Open the Wildlife section
        btnWildlife.addActionListener(e -> { //( e -> )Lambda expression receiving the event
             openWildlife(); //  Calls the openWildlife() method
        });
        
        // Add an ActionListener to the Exit button
        btnExit.addActionListener(e -> {
            System.exit(0); // Terminate the entire application
        });
        
        
        
    }

    // Method reserved for opening the Pollution section later
    public void openPollution() {
        // Connect Member 1's section later
    }

    // Method to open the Wildlife section
    public void openWildlife() {       
        wildlife.setVisible(true); // Create and display the WildlifeUI window       
        this.dispose(); // Close the main menu window
    }

    // Method reserved for opening the Fishing section later
    public void openFishing() {
        // Connect Member 3's section later
    }
    
    
}