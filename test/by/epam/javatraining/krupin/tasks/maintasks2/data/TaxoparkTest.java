package by.epam.javatraining.krupin.tasks.maintask2.model.data;

import by.epam.javatraining.krupin.tasks.maintask2.ParametresTests;
import org.junit.Test;


public class TaxoparkTest {


    @Test(expected = Exception.class)
    public void testSetTransportByNegativeIndex() throws Exception {
        ParametresTests p1 = new ParametresTests();
        p1.taxopark.setTransportByIndex(p1.car, ParametresTests.NEGATIVE_NUMBER);
    }

    @Test(expected = Exception.class)
    public void testSetTransportByIndexMoreThanNecessary() throws Exception {
        ParametresTests p1 = new ParametresTests();
        p1.taxopark.setTransportByIndex(p1.car, ParametresTests.WRONG_INDEX);
    }

    @Test(expected = Exception.class)
    public void testGetTransportByNegativeIndex() throws Exception {
        ParametresTests p1 = new ParametresTests();
        p1.taxopark.getTransportByIndex(ParametresTests.NEGATIVE_NUMBER);
    }

    @Test(expected = Exception.class)
    public void testGetTransportByIndexMoreThanNecessary() throws Exception {
        ParametresTests p1 = new ParametresTests();
        p1.taxopark.getTransportByIndex(ParametresTests.WRONG_INDEX);
    }

}
