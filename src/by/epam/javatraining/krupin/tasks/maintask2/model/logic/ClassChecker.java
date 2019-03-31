package by.epam.javatraining.krupin.tasks.maintask2.model.logic;


import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;
import org.apache.log4j.Logger;

public class ClassChecker {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void checkPositiveNumber(double... mas) throws Exception {
        ;
        for (int i = 0; i < mas.length; i++)
            if (mas[i] < 0) {
                LOGGER.info("Wrong number");
                throw new Exception("Wrong variable");
            }
    }

    public static void checkTaxoparkIndex(Transport[] transports, int index) throws Exception {
        if (index < 0 || index > transports.length) {
            LOGGER.info("Wrong taxopark index");
            throw new Exception("Wrong index!");
        }
    }

}
