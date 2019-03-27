package by.epam.javatraining.krupin.tasks.maintask2.model.logic;


public class ClassChecker {

    public static void checkPositiveNumber(double... mas) throws Exception {
        for (int i = 0; i < mas.length; i++)
            if (mas[i] < 0) {
                throw new Exception("Wrong variable");
            }
    }

}
