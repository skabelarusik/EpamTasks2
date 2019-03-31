package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import org.apache.log4j.Logger;

public class ClassCalculator {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static int summCostAllTransports(Taxopark taxopark) throws Exception {
        int sum = 0;
        LOGGER.info("Check summ ");
        if (taxopark.getTransport().length != 0) {
            for (int i = 0; i < taxopark.getTransport().length; i++) {
                if (taxopark.getTransportByIndex(i) != null) {
                    sum += taxopark.getTransportByIndex(i).getCost();
                }
            }
        }
        return sum;
    }


}
