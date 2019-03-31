package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.ParametresTests;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClassSelectorTest {

    @Test
    public void testSelectListTransportRangeAgeIfEmptyTransport() throws Exception {
        Taxopark expected = null;

        assertEquals(expected, ClassSelector.selectListTransportRangeAge(
                new ParametresTests().taxoparkEmpty, ParametresTests.ZERO, ParametresTests.ZERO));
    }

    @Test
    public void testSelectListTransportRangeAge() throws Exception {
        Taxopark expected = new ParametresTests().taxoparkSelectAge;
        assertTrue(expected.equals(ClassSelector.selectListTransportRangeAge
                (new ParametresTests().taxopark, ParametresTests.MIN_AGE, ParametresTests.MAX_AGE)));
    }

    @Test
    public void testSelectListTransportRangeFuelFlowEmptyTaxopark() throws Exception {
        Taxopark expected = null;

        assertEquals(expected, ClassSelector.selectListTransportRangeFuelFlow(
                new ParametresTests().taxoparkEmpty, ParametresTests.ZERO, ParametresTests.ZERO));
    }

    @Test
    public void testSelectListTransportRangeFuelFlow() throws Exception {
        Taxopark expected = new ParametresTests().taxoparkSelectFuelFlow;
        assertTrue(expected.equals(ClassSelector.selectListTransportRangeFuelFlow
                (new ParametresTests().taxopark, ParametresTests.MIN_FUEL_FLOW,
                        ParametresTests.MAX_FUEL_FLOW)));
    }
}
