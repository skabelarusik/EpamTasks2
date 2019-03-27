package by.epam.javatraining.krupin.tasks.maintask2.model.data.microbus;

public class Mersedes extends Microbus {
    public Mersedes(){
        super();
    }

    public Mersedes(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setName("Peugeot");
        setTv(true);
        setConditioner(true);
    }

    public Mersedes (Mersedes mersedes) {
       super(mersedes);
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
        return "Microbus {"+super.toString()+"}";
    }
}
