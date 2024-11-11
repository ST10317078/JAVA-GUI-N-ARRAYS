/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paper1;

/**
 *
 * @author mpho
 */
 public interface IEstateAgent {
    double calculateTotalSales(double[] propertySales);
    double calculateCommission(double totalSales);
    int topEstateAgent(double[] totalSales);
}


