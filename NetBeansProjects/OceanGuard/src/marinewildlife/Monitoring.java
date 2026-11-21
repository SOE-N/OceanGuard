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

public class Monitoring extends ConservationRecord{
    private int numberSeen;
    private String behaviour;

    public Monitoring() {
    }
    

    public Monitoring(int numberSeen, String behaviour, String recordID, String species, String location, String date) {
        super(recordID, species, location, date);
        this.numberSeen = numberSeen;
        this.behaviour = behaviour;
    }

    public void setNumberSeen(int numberSeen) {
        this.numberSeen = numberSeen;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public int getNumberSeen() {
        return numberSeen;
    }

    public String getBehaviour() {
        return behaviour;
    }

    @Override
    public String toString() {
        return "Monitoring{" + "numberSeen=" + numberSeen + ", behaviour=" + behaviour + '}';
    }
    
    
    
    
    


}
