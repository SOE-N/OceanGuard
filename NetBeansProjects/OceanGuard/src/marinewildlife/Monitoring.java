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
    private String description;

    public Monitoring() {
    }

    public Monitoring(int numberSeen, String behaviour, String description) {
        this.numberSeen = numberSeen;
        this.behaviour = behaviour;
        this.description = description;
    }

    public Monitoring(int numberSeen, String behaviour, String description, String recordID, String species, String location, String date) {
        super(recordID, species, location, date);
        this.numberSeen = numberSeen;
        this.behaviour = behaviour;
        this.description = description;
    }
    

    

    public void setNumberSeen(int numberSeen) {
        this.numberSeen = numberSeen;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberSeen() {
        return numberSeen;
    }

    public String getBehaviour() {
        return behaviour;
    }

    @Override
    public String toString() {
        return "Monitoring{" + "numberSeen=" + numberSeen + ", behaviour=" + behaviour + ", description=" + description + '}';
    }
    
    
    
    
    


}
