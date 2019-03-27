package by.epam.javatraining.krupin.tasks.maintask2.model.data.auto;

public class Lada extends Car {
    public Lada(){
        super();
    }

    public Lada(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setName("Lada");
    }

    public Lada (Lada transport)  {
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

    @Override
    public String toString() {
        return "Taxi {"+super.toString()+"}";
    }
}

