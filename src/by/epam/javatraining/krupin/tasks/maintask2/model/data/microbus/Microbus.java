package by.epam.javatraining.krupin.tasks.maintask2.model.data.microbus;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;

import java.util.Objects;

public abstract class Microbus extends Transport {
    private boolean tv;
    private boolean conditioner;

    public Microbus() {
        super();
    }

    public Microbus(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setColor("White");
        setPassengerCount(12);
    }

    public Microbus(Microbus microbus) {
        super(microbus);
        this.tv = microbus.tv;
        this.conditioner = microbus.conditioner;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Microbus microbus = (Microbus) o;
        return tv == microbus.tv &&
                conditioner == microbus.conditioner;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tv, conditioner);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(", tv=");
        stringBuilder.append(tv);
        stringBuilder.append(" ,conditoiner=");
        stringBuilder.append(conditioner);
        return super.toString() + stringBuilder;
    }
}
