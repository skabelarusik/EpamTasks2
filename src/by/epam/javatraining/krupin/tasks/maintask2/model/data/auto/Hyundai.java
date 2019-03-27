package by.epam.javatraining.krupin.tasks.maintask2.model.data.auto;

public class Hyundai extends Car {
    public Hyundai() {
        super();
    }

    public Hyundai(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setName("Hyundai");
    }

    public Hyundai(Hyundai transport) throws Exception {
        super(transport);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "Taxi {" + super.toString() + "}";
    }
}


