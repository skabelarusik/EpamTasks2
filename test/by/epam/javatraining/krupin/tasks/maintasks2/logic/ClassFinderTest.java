package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;
import org.junit.Assert;
import org.junit.Test;
import by.epam.javatraining.krupin.tasks.maintask2.ParametresTests;

public class ClassFinderTest {

    @Test(expected = Exception.class)
    public void testFindCheaperCarWhereEmptyTaxopark() throws Exception {
        ClassFinder.findCheaperCar(new ParametresTests().taxoparkEmpty);
    }

    @Test
    public void testFindCheaperCar() throws Exception {
        ParametresTests p1 = new ParametresTests();
        int expensive = p1.cheaperCar.getCost();
        Assert.assertEquals(expensive,  ClassFinder.findCheaperCar(p1.taxopark).getCost());
    }

    @Test(expected = Exception.class)
    public void testFindExpensiveCarWhereEmptyTaxopark() throws Exception {
        ClassFinder.findExpensiveCar(new ParametresTests().taxoparkEmpty);
    }

    @Test
    public void testFindExpensiveCar() throws Exception {
        ParametresTests p1 = new ParametresTests();
        int expensive = p1.expensiveCar.getCost();
        Assert.assertEquals(expensive,  ClassFinder.findExpensiveCar(p1.taxopark).getCost());
    }
}
