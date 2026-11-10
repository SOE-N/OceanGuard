/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marinewildlife;

/**
 *
 * @author Soe 
 */
import javax.swing.*;
import java.awt.*;
import mainmenu.MainMenu;

public class WildlifeUI extends JFrame {
    private JMenuBar menuBar;
    private JMenuItem rescue;
    private JMenuItem monitoring;
    private JMenuItem volunteer;
    private JMenuItem home;
    
    private JLabel title;
    
    

    public WildlifeUI() {

        
        setTitle("Marine Wildlife Conservation"); // Set the title of the window       
        setSize(500, 400); // Set the width to 500 pixels and height to 400 pixels       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close this window without terminating the entire application       
        setLocationRelativeTo(null); // Position the window in the centre of the screen

        
        menuBar = new JMenuBar(); // Create navigation bar     
        rescue = new JMenuItem("Rescue Report");
        monitoring = new JMenuItem("Monitoring");
        volunteer = new JMenuItem("Volunteer");
        home = new JMenuItem("Home");
        
        // Add items to navigation bar
        menuBar.add(rescue);
        menuBar.add(monitoring);
        menuBar.add(volunteer);
        menuBar.add(home);       
        setJMenuBar(menuBar); // Display navigation bar at the top
        
        JPanel panel = new JPanel(); // Create main panel
        panel.setLayout(new BorderLayout());
        
        // Create section title
        title = new JLabel("Marine Wildlife Conservation",SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));


        // Create content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 1, 10, 10));

        contentPanel.add(title);

        // Add content to main panel
        panel.add(contentPanel, BorderLayout.CENTER);

        // Add main panel to window
        add(panel);

        // Open Rescue Report Form
        rescue.addActionListener(e -> {
            new RescueReportForm().setVisible(true);
            dispose();
        });

        // Open Monitoring Form
        monitoring.addActionListener(e -> {
            new MonitoringForm().setVisible(true);
            dispose();
        });

        // Open Volunteer Form
        volunteer.addActionListener(e -> {
            new VolunteerForm().setVisible(true);
            dispose();
        });

        // Return to Main Menu
        home.addActionListener(e -> {
            MainMenu mygui = new MainMenu();
            mygui.setVisible(true);
            dispose();
        });


        
    }
}