/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paper1;

/**
 *
 * @author mpho
 */
public class EstateAgentApp {

    public static void main(String[] args) {
        // Sales data for each estate agent across January, February, and March
        double[][] salesData = {
            {800000, 1500000, 2000000}, // Joe Bloggs
            {700000, 1200000, 1600000}  // Jane Doe
        };

        String[] agentNames = {"Joe Bloggs", "Jane Doe"};
        EstateAgent estateAgent = new EstateAgent();
        double[] totalSales = new double[salesData.length];

        // Print table header
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                          "Agent", "JAN (R)", "FEB (R)", "MAR (R)", "Total Sales (R)", "Commission (R)");
        System.out.println("-----------------------------------------------------------------------------------");

        // Calculate and display sales data in table format for each agent
        for (int i = 0; i < salesData.length; i++) {
            totalSales[i] = estateAgent.calculateTotalSales(salesData[i]);
            double commission = estateAgent.calculateCommission(totalSales[i]);

            // Print each row with agent's name, monthly sales, total sales, and commission
            System.out.printf("%-15s R%-14.2f R%-14.2f R%-14.2f R%-14.2f R%-14.2f%n",
                              agentNames[i], salesData[i][0], salesData[i][1], salesData[i][2], totalSales[i], commission);
        }

        // Determine and print the top-selling agent
        int topAgentIndex = estateAgent.topEstateAgent(totalSales);
        System.out.println("\nTop Selling Agent:");
        System.out.printf("%s with Total Sales of R %.2f%n", agentNames[topAgentIndex], totalSales[topAgentIndex]);
    }
}

