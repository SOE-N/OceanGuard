/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marinewildlife;

/**
 *
 * @author travislixx
 */
import javax.swing.*;

// Import Swing components to create the graphical user interface

// WildlifeUI class inherits from JFrame to create a window
public class WildlifeUI extends JFrame {

    // Constructor: creates the Marine Wildlife Conservation window
    public WildlifeUI() {

        // Set the title of the window
        setTitle("Marine Wildlife Conservation");

        // Set the width to 500 pixels and height to 400 pixels
        setSize(500, 400);

        // Close this window without terminating the entire application
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Position the window in the centre of the screen
        setLocationRelativeTo(null);

        // Create a JLabel to display the section title
        JLabel title = new JLabel(
            "Marine Wildlife Conservation",
            SwingConstants.CENTER
        );

        // Add the title label to the window
        add(title);
    }
}