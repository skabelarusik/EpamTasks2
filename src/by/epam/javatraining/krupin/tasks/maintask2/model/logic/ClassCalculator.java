package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;

public class ClassCalculator {

    public static int summCostAllTransports(Taxopark taxopark){
        int sum = 0;

        if(taxopark.getTransport().length != 0) {
            for (int i = 0; i < taxopark.getTransport().length ; i++) {
                if(taxopark.getTransportByIndex(i) != null) {
                    sum += taxopark.getTransportByIndex(i).getCost();
                }
            }
        }
        return sum;
    }


}
