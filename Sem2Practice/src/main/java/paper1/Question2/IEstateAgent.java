/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paper1.Question2;

/**
 *
 * @author mpho
 */
public interface IEstateAgent {
    double calculateCommission(double propertyPrice, double commissionPercentage);
    boolean validateData(String location, String agentName, double propertyPrice, double commissionPercentage);
}

