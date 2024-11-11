/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Paper3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RepairsTest {

    private Repairs repairs;

    @BeforeEach
    public void setUp() {
        repairs = new Repairs();
    }

    // Test for RepairCosts method
    @Test
    public void testRepairCosts() {
        // Arrange
        double[] repairCosts = {1000.0, 1500.0, 2000.0, 1200.0};

        // Act
        double total = repairs.RepairCosts(repairCosts);

        // Assert
        assertEquals(5700.0, total, "The total repair costs should be the sum of all values in the array.");
    }

    // Test for TechnicianPay method
    @Test
    public void testTechnicianPay() {
        // Arrange
        double amount = 5000.0;

        // Act
        double pay = repairs.TechnicianPay(amount);

        // Assert
        assertEquals(50.0, pay, "The technician pay should be 1% of the provided amount.");
    }

    // Test for TopTechnician method
    @Test
    public void testTopTechnician() {
        // Arrange
        double[] repairsArray = {1000.0, 2500.0, 3000.0, 2000.0};

        // Act
        int topTechnicianIndex = repairs.TopTechnician(repairsArray);

        // Assert
        assertEquals(2, topTechnicianIndex, "The top technician index should correspond to the highest repair cost.");
    }
}
