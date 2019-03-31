package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;
import org.apache.log4j.Logger;

public class ClassFinder {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static Transport findCheaperCar(Taxopark taxopark) throws Exception {
        if (taxopark.size() == 0) {
            LOGGER.info("Empty taxopark");
            throw new Exception("No elements");
        }

        LOGGER.info("Find cheaper car");
        int cost = taxopark.getTransportByIndex(0).getCost();
        int number = 0;

        for (int i = 0; i < taxopark.size(); i++) {
            if (taxopark.getTransport()[i] != null && cost > taxopark.getTransportByIndex(i).getCost()) {
                cost = taxopark.getTransportByIndex(i).getCost();
                number = i;
            }
        }

        return taxopark.getTransportByIndex(number);
    }

    public static Transport findExpensiveCar(Taxopark taxopark) throws Exception {
        if (taxopark.size() == 0) {
            LOGGER.info("Empty taxopark");
            throw new Exception("No elements");
        }

        LOGGER.info("Find expensive car");
        int number = 0;
        int cost = taxopark.getTransportByIndex(0).getCost();


        for (int i = 0; i < taxopark.size(); i++) {
            if (taxopark.getTransport()[i] != null && cost < taxopark.getTransportByIndex(i).getCost()) {
                cost = taxopark.getTransportByIndex(i).getCost();
                number = i;
            }
        }
        return taxopark.getTransportByIndex(number);
    }


}
