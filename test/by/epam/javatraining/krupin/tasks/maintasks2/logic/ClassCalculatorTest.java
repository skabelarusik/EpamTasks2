package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.ParametresTests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassCalculatorTest {

    @Test
    public void testSummCostAllTransportTaxoparkEmpty() throws Exception {
        int expected = 0;

        assertEquals(expected, ClassCalculator.summCostAllTransports(
                new ParametresTests().taxoparkEmpty), ParametresTests.delta);
    }

    @Test
    public void testSummCostAllTransport() throws Exception {
        int expected = 26000;

        assertEquals(expected, ClassCalculator.summCostAllTransports(new ParametresTests().taxopark),
                ParametresTests.delta);
    }
}
