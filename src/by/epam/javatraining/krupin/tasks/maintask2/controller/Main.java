package by.epam.javatraining.krupin.tasks.maintask2.controller;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Taxopark;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.auto.Geely;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.auto.Hyundai;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.auto.Lada;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.auto.Toyota;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.bus.Bus;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.bus.Ikarus;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.bus.Maz;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.bus.MersedesBus;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.microbus.Gazel;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.microbus.Mersedes;
import by.epam.javatraining.krupin.tasks.maintask2.model.data.microbus.Peugeot;
import by.epam.javatraining.krupin.tasks.maintask2.model.logic.*;
import by.epam.javatraining.krupin.tasks.maintask2.view.Viewer;

/** There are transports and taxopars, and actions with them
 *  Autor  -  Andrey Krupin
 *  Development start is 25.03.2019
 */

public class Main {
    private static final String DECORATE = "**************************************";

    public static void main(String[] args) throws Exception {

   //created first taxopark
   Taxopark taxopark1 = new Taxopark();
   Transport car1 = new Toyota(5000, 8.5, 7);
   Transport car2 = new Geely(3000, 7.2, 10);
   Transport car3 = new Lada(4500, 6.5, 3);
   Transport car4 = new Hyundai(7000, 6, 2);
   Transport car5 = new Toyota(8000, 7.5, 4);

   taxopark1.add(car1);
   taxopark1.add(car2);
   taxopark1.add(car3);
   taxopark1.add(car4);
   taxopark1.add(car5);

   //created second taxopark
   Taxopark taxopark2 = new Taxopark();
   Transport bus1 = new Maz(19000, 12, 4);
   Transport bus2 = new Ikarus(7000, 15.8, 12);
   Transport bus3 = new MersedesBus(35000, 14, 2);
   Transport microbus1 = new Peugeot(8500, 11.4, 3);
   Transport microbus2 = new Mersedes(12400, 12.5, 2);
   Transport microbus3 = new Gazel(4500, 13.8, 12);
   Transport microbus4 = new Transport(microbus3);

   taxopark2.add(bus1);
   taxopark2.add(bus2);
   taxopark2.add(bus3);
   taxopark2.add(microbus1);
   taxopark2.add(microbus2);
   taxopark2.add(microbus3);
   taxopark2.add(microbus4);

   //created third Taxopark
   Taxopark taxopark3 = new Taxopark(taxopark1);
   taxopark3.add(bus1);
   taxopark3.add(taxopark2);
   taxopark3.add(microbus3);

   Viewer.viewTaxopark(taxopark3);
   System.out.println(DECORATE);

   //find sum all transports in taxopark1
   System.out.println(ClassCalculator.summCostAllTransports(taxopark1));
   System.out.println(DECORATE);

   //find Expensive and Cheaper Transport
   System.out.println(ClassFinder.findExpensiveCar(taxopark3));
   System.out.println(ClassFinder.findCheaperCar(taxopark3));
   System.out.println(DECORATE);

   //Select taxopark by age (min age, max age)
   Viewer.viewTaxopark(
           ClassSelector.selectListTransportRangeAge(taxopark2, 5, 12));
   System.out.println(DECORATE);

   //Sort all transports by cost in taxopark2
   ClassSorter.sortTransportCostDecrease(taxopark2);
   Viewer.viewTaxopark(taxopark2);
    }
}
