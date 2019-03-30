package by.epam.javatraining.krupin.tasks.maintask2.model.data;

import by.epam.javatraining.krupin.tasks.maintask2.ParametresTests;
import org.junit.Test;

public class TransportTest {


    @Test(expected = Exception.class)
    public void testSetNegativeCost() throws Exception {
        Transport transport = new Transport();
        transport.setCost(ParametresTests.NEGATIVE_NUMBER);
    }

    @Test(expected = Exception.class)
    public void testSetNegativeFuel_flow() throws Exception {
        new Transport().setFuel_flow(ParametresTests.NEGATIVE_NUMBER);
    }

    @Test(expected = Exception.class)
    public void testSetNegativeAge() throws Exception {
        new Transport().setAge(ParametresTests.NEGATIVE_NUMBER);
    }

    @Test(expected = Exception.class)
    public void testSetNegativePassengerCount() throws Exception {
        new Transport().setPassengerCount(ParametresTests.NEGATIVE_NUMBER);
    }
}
