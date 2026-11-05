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

public class WildlifeUI extends JFrame{
     public WildlifeUI() {

        setTitle("Marine Wildlife Conservation");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel(
            "Marine Wildlife Conservation",
            SwingConstants.CENTER
        );

        add(title);
    }
    
}
