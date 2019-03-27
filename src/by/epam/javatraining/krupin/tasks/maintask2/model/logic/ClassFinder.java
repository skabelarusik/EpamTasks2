package by.epam.javatraining.krupin.tasks.maintask2.model.logic;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;

public class ClassFinder {

    public static Transport findCheaperCar(Taxopark taxopark) throws Exception {
        if(taxopark.size() == 0){
            throw new Exception("No elements");
        }

        int cost = taxopark.getTransportByIndex(0).getCost();
        int number = 0;

        for(int i = 0; i < taxopark.size(); i++){
            if(taxopark.getTransport()[i] != null && cost > taxopark.getTransportByIndex(i).getCost()){
                cost = taxopark.getTransportByIndex(i).getCost();
                number = i;
            }
        }
        return taxopark.getTransportByIndex(number);
    }

    public static Transport findExpensiveCar(Taxopark taxopark) throws Exception {
        if(taxopark.size() == 0){
            throw new Exception("No elements");
        }

        int number = 0;
        int cost = taxopark.getTransportByIndex(0).getCost();


        for(int i = 0; i < taxopark.size(); i++){
            if(taxopark.getTransport()[i] != null && cost < taxopark.getTransportByIndex(i).getCost()){
                cost = taxopark.getTransportByIndex(i).getCost();
                number = i;
            }
        }
        return taxopark.getTransportByIndex(number);
    }




}
