/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paper3.question2;

import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author mpho
 */
public class Technician implements ITechnician{

    @Override
    public double CalculatePay(double repairCost, double prate) {
        return repairCost * (prate / 100);
    }

    @Override
    public boolean ValidateData(String Location, String Name, double cost, double rate) {
        return !Location.isEmpty() && !Name.isEmpty() && cost > 0 && rate > 0;
    }
    
    public String process(String Location, String Name, double cost, double rate ){


    // Validate input data
    if (ValidateData(Location, Name, cost, rate)) {
       // Calculate commission
        double pay = CalculatePay(cost, rate);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "ZA"));
        
        // Build the report text using string concatenation
        String report = "TECHNICIAN LOCATION: " + Location + "\n" +
                        "TECHNIACAIN NAME: " + Name + "\n" +
                        "REPAIR COST: " + currencyFormatter.format(cost) + "\n" +
                        "Commission (" + rate + "%): " + currencyFormatter.format(pay) + "\n";
        
        // Display the report in the text area
        return report;
    } else {
        JOptionPane.showMessageDialog(null, "All fields must be filled, and numeric values must be greater than zero.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return null; 
    }
  }
    
    public void saveReport(String report){
        try (FileWriter writer = new FileWriter("report.txt")) {
            writer.write(report);
            JOptionPane.showMessageDialog(null, "Report saved to report.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving the report.", "File Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
}
