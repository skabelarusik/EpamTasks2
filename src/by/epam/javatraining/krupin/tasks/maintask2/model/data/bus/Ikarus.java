package by.epam.javatraining.krupin.tasks.maintask2.model.data.bus;

public class Ikarus extends Bus {
    public Ikarus(){
        super();
    }

    public Ikarus(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setName("Ikarus");
        setColor("Green");
        setPassengerCount(35);
        setBaggage(30);
        setTv(false);
        setCofe(false);
    }

    public Ikarus (Ikarus ikarus) {
        super(ikarus);
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
