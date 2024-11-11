/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paper3;

/**
 *
 * @author mpho
 */
public class RepairsApplication {
        public static void main(String[] args) {
        // Sales data for each estate agent across January, February, and March
        double[][] repairData = {
            {8000, 2500, 5000}, // Joe Bloggs
            {7000, 2200, 5600}  // Jane Doe
        };

        String[] techNames = {"Joe Bloggs", "Jane Doe"};
        Repairs repairs = new Repairs();
        double[] totalRepairs = new double[repairData.length];

        // Print table header
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                          "Agent", "JAN (R)", "FEB (R)", "MAR (R)", "Total Sales (R)", "Commission (R)");
        System.out.println("-----------------------------------------------------------------------------------");

        // Calculate and display sales data in table format for each agent
        for (int i = 0; i < repairData.length; i++) {
            totalRepairs[i] = repairs.RepairCosts(repairData[i]);
            double commission = repairs.TechnicianPay(totalRepairs[i]);

            // Print each row with  name, monthly sales, total sales, and commission
            System.out.printf("%-15s R%-14.2f R%-14.2f R%-14.2f R%-14.2f R%-14.2f%n",
                              techNames[i], repairData[i][0], repairData[i][1], repairData[i][2], totalRepairs[i], commission);
        }

        // Determine and print the top-selling agent
        int topAgentIndex = repairs.TopTechnician(totalRepairs);
        System.out.println("\nTop performing Vehicle Repair Agent:");
        System.out.printf("%s with Total Sales of R %.2f%n", techNames[topAgentIndex], totalRepairs[topAgentIndex]);
    }
}
