package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;
import org.apache.log4j.Logger;

public class ClassSorter {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getLogger(ClassSorter.class);
    }

    public static Taxopark sortTransportCostDecrease(Taxopark taxopark) throws Exception {
        LOGGER.info("Sort transport by cost decrease");

        if(taxopark.getTransport().length != 0){
            int min;
            Transport temp;
            for(int i = 0; i < taxopark.getTransport().length; i++){
                if(taxopark.getTransportByIndex(i) !=null){
                min = taxopark.getTransportByIndex(i).getCost();
                for(int j = i; j < taxopark.getTransport().length; j++){
                    if(taxopark.getTransportByIndex(j) != null)
                    {

                        if(min > taxopark.getTransportByIndex(j).getCost()){
                            min = taxopark.getTransportByIndex(j).getCost();
                            temp = new Transport(taxopark.getTransportByIndex(j));
                            taxopark.setTransportByIndex(
                                    new Transport(taxopark.getTransportByIndex(i)),j);
                            taxopark.setTransportByIndex(temp, i);
                        }
                    }
                }
                }
            }
        }

        return taxopark;
    }

    public static Taxopark sortTransportAgeIncrease(Taxopark taxopark) throws Exception {
        LOGGER.info("Sort transport by age increase");

        if(taxopark.getTransport().length != 0){
            int max;
            Transport temp;
            for(int i = 0; i < taxopark.getTransport().length; i++){
                if(taxopark.getTransportByIndex(i) !=null){
                    max = taxopark.getTransportByIndex(i).getAge();
                    for(int j = i; j < taxopark.getTransport().length; j++){
                        if(taxopark.getTransportByIndex(j) != null)
                        {

                            if(max > taxopark.getTransportByIndex(j).getAge()){
                                max = taxopark.getTransportByIndex(j).getAge();
                                temp = new Transport(taxopark.getTransportByIndex(j));
                                taxopark.setTransportByIndex(
                                        new Transport(taxopark.getTransportByIndex(i)),j);
                                taxopark.setTransportByIndex(temp, i);
                            }
                        }
                    }
                }
            }
        }
    return taxopark;
    }

}

