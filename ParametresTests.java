package by.epam.javatraining.krupin.tasks.maintask2;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.auto.Toyota;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.bus.Maz;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.bus.MersedesBus;

public class ParametresTests  {

    public static final int ZERO = 0;
    public static final int NEGATIVE_NUMBER = -10;
    public static final int WRONG_INDEX = 10000;

    public static double delta = 0.00006;

    public Transport[] transport = new Transport[]{new Toyota(3000, 5,7),
        new MersedesBus(8000, 12,4), new Maz(15000, 15, 3)};
    public Taxopark taxopark = new Taxopark(transport);
    public Transport car = new Toyota(3000, 5,7);
    public Taxopark taxoparkEmpty = new Taxopark();
    public Transport cheaperCar = transport[0];
    public Transport expensiveCar = transport[2];

    public ParametresTests() throws Exception {
    }
}
