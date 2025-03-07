import org.example.ShippingCostCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShippingCostCalculatorTest {


    @Test
    public void testCalculateShippingCost1() {
        assertEquals(-1, ShippingCostCalculator.calculateShippingCost(-1, 0), 1e-9);
    }

    @Test
    public void testCalculateShippingCost2() {
        assertEquals(45100, ShippingCostCalculator.calculateShippingCost(4, 31), 1e-9);
    }

    @Test
    public void testCalculateShippingCost3() {
        assertEquals(20000, ShippingCostCalculator.calculateShippingCost(4, 10), 1e-9);
    }

    @Test
    public void testCalculateShippingCost4() {
        assertEquals(73150, ShippingCostCalculator.calculateShippingCost(10, 31), 1e-9);
    }

    @Test
    public void testCalculateShippingCost5() {
        assertEquals(27500, ShippingCostCalculator.calculateShippingCost(10, 5), 1e-9);
    }

    @Test
    public void testCalculateShippingCost6() {
        assertEquals(95700, ShippingCostCalculator.calculateShippingCost(41, 31), 1e-9);
    }

    @Test
    public void testCalculateShippingCost7() {
        assertEquals(35000, ShippingCostCalculator.calculateShippingCost(41, 5), 1e-9);
    }
}
