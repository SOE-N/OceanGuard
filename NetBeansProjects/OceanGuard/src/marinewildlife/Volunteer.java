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

public class Volunteer {

    // Attributes
    private String volunteerID;
    private String name;
    private String email;
    private String interest;
    private String availability;
    private int duration;

    // Constructor
    public Volunteer(String volunteerID, String name, String email,
                     String interest, String availability, int duration) {

        this.volunteerID = volunteerID;
        this.name = name;
        this.email = email;
        this.interest = interest;
        this.availability = availability;
        this.duration = duration;
    }

    // Getters
    public String getVolunteerID() {
        return volunteerID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getInterest() {
        return interest;
    }

    public String getAvailability() {
        return availability;
    }

    public int getDuration() {
        return duration;
    }

    // Setters
    public void setVolunteerID(String volunteerID) {
        this.volunteerID = volunteerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Display volunteer details
    public String getDetails() {
        return "Volunteer ID: " + volunteerID
                + "\nName: " + name
                + "\nEmail: " + email
                + "\nInterest: " + interest
                + "\nAvailability: " + availability
                + "\nDuration: " + duration;
    }
}




