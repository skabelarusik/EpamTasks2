package by.epam.javatraining.krupin.tasks.maintask2.model.data.bus;

import by.epam.javatraining.krupin.tasks.maintask2.model.data.Transport;

import java.util.Objects;

public abstract class Bus extends Transport {
    private boolean tv;
    private boolean cofe;
    private int baggage;

    public Bus(){
        super();
    }

    public Bus(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setColor("Green");
    }

    public Bus(Bus bus){
        super(bus);
        this.tv = bus.tv;
        this.baggage = bus.baggage;
        this.cofe = bus.cofe;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isCofe() {
        return cofe;
    }

    public void setCofe(boolean cofe) {
        this.cofe = cofe;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return tv == bus.tv &&
                cofe == bus.cofe &&
                baggage == bus.baggage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tv, cofe, baggage);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(", tv=");
        stringBuilder.append(tv);
        stringBuilder.append(" ,cofe=");
        stringBuilder.append(cofe);
        stringBuilder.append(" ,baggage=");
        stringBuilder.append(baggage);
        return super.toString() + stringBuilder;
    }
}
