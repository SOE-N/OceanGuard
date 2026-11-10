/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marinewildlife;

/**
 *
 * @author travislixx
 */
public class ConservationRecord {
    // Common attributes shared by both child classes
    private String recordID;
    private String species;
    private String location;
    private String date;

    // Constructor

    public ConservationRecord() {
    }
    
    
    public ConservationRecord(String recordID, String species,String location, String date) {
        this.recordID = recordID;
        this.species = species;
        this.location = location;
        this.date = date;
    }

    // Getters
    public String getRecordID() {
        return recordID;
    }

    public String getSpecies() {
        return species;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    // Setters
    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ConservationRecord{" + "recordID=" + recordID + ", species=" + species + ", location=" + location + ", date=" + date + '}';
    }
    
    

    // Display common record details
    public String getDetails() {
        return "Record ID: " + recordID
                + "\nSpecies: " + species
                + "\nLocation: " + location
                + "\nDate: " + date;
    }
    
}
