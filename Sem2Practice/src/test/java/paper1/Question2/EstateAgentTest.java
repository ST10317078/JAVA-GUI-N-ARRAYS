/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package paper1.Question2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mpho
 */
public class EstateAgentTest {
    private EstateAgent estateAgent;

    @BeforeEach
    public void setUp() {
        // Initialize the EstateAgent instance before each test
        estateAgent = new EstateAgent();
    }

    // Test for calculateCommission method
    @Test
    public void testCalculateCommission() {
        // Arrange
        double propertyPrice = 1000000; // Example property price
        double commissionPercentage = 5; // 5% commission rate
        
        // Act
        double commission = estateAgent.calculateCommission(propertyPrice, commissionPercentage);
        
        // Assert
        assertEquals(50000, commission, "Commission should be 5% of 1,000,000");
    }

    // Test for validateData method with valid data
    @Test
    public void testValidateData_ValidInput() {
        // Arrange
        String location = "Cape Town";
        String agentName = "John Doe";
        double propertyPrice = 1000000; // Example property price
        double commissionPercentage = 5; // 5% commission rate

        // Act
        boolean isValid = estateAgent.validateData(location, agentName, propertyPrice, commissionPercentage);

        // Assert
        assertTrue(isValid, "Validation should pass for valid input data");
    }

    // Test for validateData method with invalid data (negative price)
    @Test
    public void testValidateData_InvalidInput() {
        // Arrange
        String location = "Cape Town";
        String agentName = "John Doe";
        double propertyPrice = -1000000; // Invalid property price
        double commissionPercentage = 5;

        // Act
        boolean isValid = estateAgent.validateData(location, agentName, propertyPrice, commissionPercentage);

        // Assert
        assertFalse(isValid, "Validation should fail for negative property price");
    }
    
}
