package by.epam.javatraining.krupin.tasks.maintask2.model.logic;


import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;

public class ClassChecker {

    public static void checkPositiveNumber(double... mas) throws Exception {
        for (int i = 0; i < mas.length; i++)
            if (mas[i] < 0) {
                throw new Exception("Wrong variable");
            }
    }

    public static void checkTaxoparkIndex(Transport[] transports, int index) throws Exception {
        if(index < 0 || index > transports.length){
            throw new Exception("Wrong index!");
        }
    }

}
