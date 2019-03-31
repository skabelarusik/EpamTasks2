package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;
import org.apache.log4j.Logger;

public class ClassSelector {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static Taxopark selectListTransportRangeAge(Taxopark taxopark, int minAge, int maxAge) throws Exception {
        LOGGER.info("select list transport range age");
        Taxopark listTransport = null;
        if (taxopark.getTransport().length != 0) {
            int count = 0;
            for (int i = 0; i < taxopark.getTransport().length; i++) {
                if (taxopark.getTransportByIndex(i) != null &&
                        taxopark.getTransportByIndex(i).getAge() >= minAge &&
                        taxopark.getTransportByIndex(i).getAge() <= maxAge) {
                    count++;
                }
            }

            listTransport = new Taxopark(count);

            for (int i = 0; i < taxopark.getTransport().length; i++) {
                if (taxopark.getTransportByIndex(i) != null &&
                        taxopark.getTransportByIndex(i).getAge() >= minAge &&
                        taxopark.getTransportByIndex(i).getAge() <= maxAge) {
                    listTransport.add(taxopark.getTransportByIndex(i));
                }
            }
        }
        return listTransport;
    }

    public static Taxopark selectListTransportRangeFuelFlow(Taxopark taxopark, double minFlow, double maxFlow) throws Exception {
        LOGGER.info("select list transport range fuel flow");
        Taxopark list = null;

        if (taxopark.getTransport().length != 0) {
            int count = 0;
            for (int i = 0; i < taxopark.getTransport().length; i++) {
                if (taxopark.getTransportByIndex(i) != null &&
                        taxopark.getTransportByIndex(i).getAge() >= minFlow &&
                        taxopark.getTransportByIndex(i).getAge() <= maxFlow) {
                    count++;
                }
            }

            list = new Taxopark(count);
            for (int i = 0; i < taxopark.getTransport().length; i++) {
                if (taxopark.getTransportByIndex(i) != null &&
                        taxopark.getTransportByIndex(i).getFuel_flow() >= minFlow &&
                        taxopark.getTransportByIndex(i).getFuel_flow() <= maxFlow) {
                    list.add(taxopark.getTransportByIndex(i));
                }
            }
        }
        return list;
    }
}
