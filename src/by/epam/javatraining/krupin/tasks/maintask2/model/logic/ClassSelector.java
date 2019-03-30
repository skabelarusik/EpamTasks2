package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;

public class ClassSelector {


    public static Taxopark selectListTransportRangeAge(Taxopark taxopark, int minAge, int maxAge) throws Exception {
        Taxopark listTransport = null;
        if(taxopark.getTransport().length != 0){
            listTransport = new Taxopark();
            for(int i = 0 ; i < taxopark.getTransport().length; i++){
                if(taxopark.getTransportByIndex(i) != null &&
                        taxopark.getTransportByIndex(i).getAge() >= minAge &&
                        taxopark.getTransportByIndex(i).getAge() <= maxAge){
                    listTransport.add(taxopark.getTransportByIndex(i));
                }
            }
        }
        return listTransport;
    }

    public static Taxopark selectListTransportRangeFuelFlow(Taxopark taxopark, double minFlow, double maxFlow) throws Exception {
        Taxopark list = null;

        if(taxopark.getTransport().length != 0){
            list = new Taxopark();
            for (int i = 0; i < taxopark.getTransport().length; i++){
                if(taxopark.getTransportByIndex(i) != null &&
                        taxopark.getTransportByIndex(i).getFuel_flow() >= minFlow &&
                        taxopark.getTransportByIndex(i).getFuel_flow() <= maxFlow){
                    list.add(taxopark.getTransportByIndex(i));
                }
            }
        }
        return list;
    }
}
