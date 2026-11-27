/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marinewildlife;

/**
 *
 * @author Soe
 */
public class RescueReport extends ConservationRecord {
    private String condition;

    // Constructor

    public RescueReport() {
    }
    
    

    public RescueReport(String condition, String recordID, String species, String location, String date) {
        super(recordID, species, location, date);
        this.condition = condition;
    }
    

    // Getter
    public String getCondition() {
        return condition;
    }

    // Setter
    public void setCondition(String condition) {
        this.condition = condition;
    }
    
   
    // Display rescue report details
    @Override
    public String getDetails() {
        return super.getDetails() + "\nCondition: " + condition;
    }
    

}
