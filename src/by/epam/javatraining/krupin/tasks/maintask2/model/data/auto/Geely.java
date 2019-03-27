package by.epam.javatraining.krupin.tasks.maintask2.model.data.auto;

public class Geely extends Car {
    public Geely(){
        super();
    }

    public Geely(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setName("Geely");
    }

    public Geely (Geely transport){
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

