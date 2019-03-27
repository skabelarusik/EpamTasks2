package by.epam.javatraining.krupin.tasks.maintask2.model.data.auto;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;


import java.util.Objects;

public abstract class Car extends Transport {
    private boolean conditioner;
    private boolean childCarSeat;

    public Car(){
        super();
    }

    public Car(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setColor("Yellow");
        setPassengerCount(4);
        conditioner = false;
        childCarSeat = false;
    }

    public Car(Car car){
        super(car);
        this.conditioner = car.conditioner;
        this.childCarSeat = car.childCarSeat;
    }


    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    public boolean isChildCarSeat() {
        return childCarSeat;
    }

    public void setChildCarSeat(boolean childCarSeat) {
        this.childCarSeat = childCarSeat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return conditioner == car.conditioner &&
                childCarSeat == car.childCarSeat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), conditioner, childCarSeat);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(", conditioner=");
        stringBuilder.append(conditioner);
        stringBuilder.append(" ,childCarSeat=");
        stringBuilder.append(childCarSeat);
        return super.toString() + stringBuilder;
    }


}
