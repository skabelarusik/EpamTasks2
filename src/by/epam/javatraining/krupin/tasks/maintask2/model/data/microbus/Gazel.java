package by.epam.javatraining.krupin.tasks.maintask2.model.data.microbus;

public class Gazel extends Microbus {
    public Gazel() {
        super();
    }

    public Gazel(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setName("Gazel");
        setTv(false);
        setConditioner(false);
    }

    public Gazel(Gazel gazel) throws Exception {
        super(gazel);
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
        return "Microbus {" + super.toString() + "}";
    }
}
