package by.epam.javatraining.krupin.tasks.maintask2.model.data.bus;

public class Maz extends Bus {
    public Maz(){
        super();
    }

    public Maz(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setName("Maz");
        setColor("Green");
        setPassengerCount(40);
        setBaggage(50);
        setTv(true);
        setCofe(false);
    }

    public Maz (Maz maz) {
        super(maz);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Bus {"+super.toString()+"}";
    }
}
