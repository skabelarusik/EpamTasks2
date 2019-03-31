package by.epam.javatraining.krupin.tasks.maintask2;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.auto.Toyota;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.bus.Maz;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.bus.MersedesBus;
import by.epam.javatraining.krupin.tasks.maintask2.model.logic.ClassSelector;

public class ParametresTests {

    public static final int ZERO = 0;
    public static final int NEGATIVE_NUMBER = -10;
    public static final int WRONG_INDEX = 10000;
    public static final int MIN_AGE = 4;
    public static final int MAX_AGE = 6;
    public static final int MIN_FUEL_FLOW = 4;
    public static final int MAX_FUEL_FLOW = 13;

    public static double delta = 0.00006;

    public Transport[] transport = new Transport[]{new Toyota(3000, 7, 3),
            new MersedesBus(8000, 12, 4), new Maz(15000, 15, 7)};
    public Transport[] transportForSort = new Transport[]{new Toyota(3000, 7, 3),
            new Maz(15000, 15, 7), new MersedesBus(8000, 12, 4)};
    public Transport[] transportSelectAge = new Transport[]{new MersedesBus(7000, 12, 4)};
    //   public Transport

    public Taxopark taxopark = new Taxopark(transport);
    public Taxopark taxoparkForSort = new Taxopark(transportForSort);
    public Taxopark taxoparkEmpty = new Taxopark(0);
    public Taxopark taxoparkSelectAge = new Taxopark(new Transport[]{new MersedesBus(8000, 12, 4),
    });
    public Taxopark taxoparkSortCostDecrease = new Taxopark(new Transport[]{new Toyota(3000, 7, 3),
            new MersedesBus(8000, 12, 4), new Maz(15000, 15, 7)});
    public Taxopark taxoparkSortAgeIncrease = new Taxopark(new Transport[]{new Toyota(3000, 7, 3),
            new MersedesBus(8000, 12, 4), new Maz(15000, 15, 7)});
    public Taxopark taxoparkSelectFuelFlow = new Taxopark(
            new Transport[]{new Toyota(3000, 7, 3),
                    new MersedesBus(8000, 12, 4)});


    public Transport car = new Toyota(3000, 5, 7);
    public Transport cheaperCar = transport[0];
    public Transport expensiveCar = transport[2];
    public Transport car1 = new Transport(3000, 5, 7);

    public ParametresTests() throws Exception {
    }


}
