/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmenu;

/**
 *
 * @author travislixx
 */

import javax.swing.*;
import marinewildlife.WildlifeUI;
public class MainMenu extends JFrame {
    
    private JButton btnPollution;
    private JButton btnWildlife;
    private JButton btnFishing;

    public MainMenu() {

        setTitle("OceanGuard");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("OceanGuard", SwingConstants.CENTER);
        title.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 28));

        btnPollution = new JButton("Marine Pollution Management");
        btnWildlife = new JButton("Marine Wildlife Conservation");
        btnFishing = new JButton("Sustainable Fishing Management");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        title.setAlignmentX(CENTER_ALIGNMENT);
        btnPollution.setAlignmentX(CENTER_ALIGNMENT);
        btnWildlife.setAlignmentX(CENTER_ALIGNMENT);
        btnFishing.setAlignmentX(CENTER_ALIGNMENT);

        panel.add(Box.createVerticalStrut(40));
        panel.add(title);
        panel.add(Box.createVerticalStrut(30));
        panel.add(btnPollution);
        panel.add(Box.createVerticalStrut(15));
        panel.add(btnWildlife);
        panel.add(Box.createVerticalStrut(15));
        panel.add(btnFishing);

        add(panel);

        // Open Marine Wildlife Conservation
        btnWildlife.addActionListener(e -> {
            new WildlifeUI().setVisible(true);
            this.dispose();
        });
    }

    public void openPollution() {
        // Connect Member 1's section later
    }

    public void openWildlife() {
        new WildlifeUI().setVisible(true);
        this.dispose();
    }

    public void openFishing() {
        // Connect Member 3's section later
    }
    
}
