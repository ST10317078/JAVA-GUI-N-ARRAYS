/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paper3.question2;

/**
 *
 * @author mpho
 */
public interface ITechnician {
    double CalculatePay(double repairCost, double rate);
    boolean ValidateData(String Location, String Name, double costs, double rate);
}
