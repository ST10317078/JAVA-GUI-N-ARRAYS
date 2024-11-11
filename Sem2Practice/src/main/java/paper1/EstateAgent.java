/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paper1;

/**
 *
 * @author mpho
 */
public class EstateAgent implements IEstateAgent {
 
    
    @Override
    public double calculateTotalSales(double[] propertySales){
       double total = 0;
       for(double sale: propertySales){
           total += sale;
       }
        return total;
    }
    
    @Override
    public double calculateCommission(double totalSales){
        return totalSales * 0.02;
    }
    
    @Override
    public int topEstateAgent(double[] totalSales){
        int topAgentIndex = 0;
        double maxSales = totalSales[0];
        for(int i = 1; i < totalSales.length; i++){
            if(totalSales[i] > maxSales){
                maxSales = totalSales[i];
                topAgentIndex = i;
            }
        }
        return topAgentIndex;
    }
    
    
}
