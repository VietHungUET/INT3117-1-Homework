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

    // Kiểm thử với độ phủ all use
    @ParameterizedTest
    @CsvSource({
            "-7, 7 , -1",
            "45, 20, 65000",
            "4, 20, 30000",
            "25, 20, 50000",
            "10, -5, -1",
            "45, 35, 104500 ",
            "35, 20, 50000",
            "45, 25, 75000",
            "35, 3, 24500",
            "25, 3, 24500",
            "35, 25, 57500 ",
            "35, 35, 79750",
    })
    void all_use_testCalculateShippingCost(int weight, int distance, double expected) {
        assertEquals(expected, ShippingCostCalculator.calculateShippingCost(weight, distance), 1e-9);
    }
}
