package by.epam.javatraining.krupin.tasks.maintask2.model.data.microbus;

public class Peugeot extends Microbus {
    public Peugeot(){
        super();
    }

    public Peugeot(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setName("Peugeot");
        setTv(false);
        setConditioner(true);
    }

    public Peugeot (Peugeot peugeot) {
        super(peugeot);
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
