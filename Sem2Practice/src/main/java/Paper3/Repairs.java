/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paper3;

/**
 *
 * @author mpho
 */
public class Repairs implements IRepairs{

    @Override
    public double RepairCosts(double[] repairCosts) {
         double total = 0;

        for(double cost: repairCosts){
            total += cost;
        }
        return total;
    }

    @Override
    public double TechnicianPay(double amount) {
        double pay = amount * 0.010;
        return pay;
    }

    @Override
    public int TopTechnician(double[] repairs) {
        int topTechnicianIndex = 0;
        double maxRepairs = repairs[0];
        for(int i = 1; i < repairs.length; i++){
            if(repairs[i] > maxRepairs){
                maxRepairs = repairs[i];
                topTechnicianIndex = i;
            }
        }
        return topTechnicianIndex;
    }
}
    
  
