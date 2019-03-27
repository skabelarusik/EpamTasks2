package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;

public class ClassSorter {

    public static void sortTransportCostDecrease(Taxopark taxopark) throws Exception {

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
    }

    public static void sortTransportAgeIncrease(Taxopark taxopark){

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
    }

}

