package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.ParametresTests;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class ClassSorterTest {

    @Test
    public void testSortTransportCostDecreaseEmptyTaxopark() throws Exception {
        Taxopark expected = new Taxopark(0);

        assertTrue(expected.equals(ClassSorter.sortTransportCostDecrease(
                new ParametresTests().taxoparkEmpty)));
    }

    @Test
    public void testSortTransportCostDecrease() throws Exception {
        Taxopark expected = new ParametresTests().taxoparkSortCostDecrease;

        assertTrue(expected.equals(ClassSorter.sortTransportCostDecrease(new ParametresTests().taxoparkForSort)));
    }

    @Test
    public void testSortTransportAgeIncreaseEmptyTaxopark() throws Exception {
        Taxopark expected = new Taxopark(0);

        assertTrue(expected.equals(ClassSorter.sortTransportAgeIncrease(
                new ParametresTests().taxoparkEmpty)));
    }

    @Test
    public void testSortTransportAgeIncrease() throws Exception {
        Taxopark expected = new ParametresTests().taxoparkSortAgeIncrease;

        assertTrue(expected.equals(ClassSorter.sortTransportAgeIncrease(
                new ParametresTests().taxoparkForSort)));
    }


}
