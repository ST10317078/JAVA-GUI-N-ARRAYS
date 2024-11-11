/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package paper1;

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
public class EstateAgentAppTest {
    
      @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        EstateAgent agent = new EstateAgent();
        double[] sales = {800000, 1500000, 2000000};
        assertEquals(4300000, agent.calculateTotalSales(sales));
    }
    
        @Test
    public void CalculateCommission_ReturnsCommision() {
        EstateAgent agent = new EstateAgent();
        double totalSales = 4300000;
        assertEquals(86000, agent.calculateCommission(totalSales));
    }

    @Test
    public void TopEstateAgent_ReturnsTopPosition() {
        EstateAgent agent = new EstateAgent();
        double[] totalSales = {4300000, 3500000};
        assertEquals(0, agent.topEstateAgent(totalSales)); // Joe Bloggs has higher sales
    }    
}
