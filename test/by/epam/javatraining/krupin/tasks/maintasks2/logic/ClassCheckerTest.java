package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.ParametresTests;
import org.junit.Test;

public class ClassCheckerTest {

    @Test (expected = Exception.class)
    public void testCheckPositiveNumberWhereNegative() throws Exception {
        ClassChecker.checkPositiveNumber(ParametresTests.NEGATIVE_NUMBER);
    }

    @Test (expected = Exception.class)
    public void testCheckTaxoparkNegativeIndex() throws Exception {
        ClassChecker.checkTaxoparkIndex(new ParametresTests().transport,
                ParametresTests.NEGATIVE_NUMBER);
    }

    @Test (expected = Exception.class)
    public void testCheckTaxoparkIndexMoreNecessary() throws Exception {
        ClassChecker.checkTaxoparkIndex(new ParametresTests().transport,
                ParametresTests.WRONG_INDEX);
    }
}
