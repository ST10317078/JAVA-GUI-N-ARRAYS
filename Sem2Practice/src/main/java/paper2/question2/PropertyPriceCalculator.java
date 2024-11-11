/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paper2.question2;

/**
 *
 * @author mpho
 */
public class PropertyPriceCalculator {
    
    public static void main(String[] args) {
        // Define the 2D array with property prices for each province
        double[][] propertyPrices = {
            {800000, 1500000, 2000000}, // Gauteng
            {700000, 1200000, 1600000}, // Natal
            {750000, 1300000, 1800000}  // Cape
        };

        // Define arrays for province and property type names
        String[] provinces = {"Gauteng", "Natal", "Cape"};
        String[] propertyTypes = {"Flat", "Townhouse", "House"};

        // Print table header
        System.out.printf("%-15s %-15s %-15s %-15s %-20s%n", 
                          "Province", "Flat", "Townhouse", "House", "Total Average Price");
        System.out.println("-------------------------------------------------------------------------------");

        // Calculate and print each property price in a table format for each province
        for (int i = 0; i < propertyPrices.length; i++) {
            double total = 0;

            // Sum prices for the current province
            for (int j = 0; j < propertyPrices[i].length; j++) {
                total += propertyPrices[i][j];
            }

            // Print each province's row with property prices and total
            System.out.printf("%-15s R%-14.2f R%-14.s2f R%-14.2f R%-19.2f%n", 
                              provinces[i], propertyPrices[i][0], propertyPrices[i][1], 
                              propertyPrices[i][2], total);
        }
        
                // Calculate and print the total average property price for each province
        for (int i = 0; i < propertyPrices.length; i++) {
            double total = 0;
            for (int j = 0; j < propertyPrices[i].length; j++) {
                total += propertyPrices[i][j]; // Sum up prices for each property type in a province
            }
            System.out.printf("Total average property price for %s: R %.2f%n", provinces[i], total);
        }
    }
}
