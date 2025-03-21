import org.example.ShippingCostCalculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingCostCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "-1, 0, -1",
            "4, 31, 45100",
            "4, 10, 20000",
            "10, 31, 73150",
            "10, 5, 27500",
            "41, 31, 95700",
            "41, 5, 35000"
    })
    void testCalculateShippingCost(int weight, int distance, double expected) {
        assertEquals(expected, ShippingCostCalculator.calculateShippingCost(weight, distance), 1e-9);
    }
}
