/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paper1.Question2;

/**
 *
 * @author mpho
 */
public class EstateAgent implements IEstateAgent {

    @Override
    public double calculateCommission(double propertyPrice, double commissionPercentage) {
        return propertyPrice * (commissionPercentage / 100);
    }

    @Override
    public boolean validateData(String location, String agentName, double propertyPrice, double commissionPercentage) {
        return !location.isEmpty() && !agentName.isEmpty() && propertyPrice > 0 && commissionPercentage > 0;
    }
}
