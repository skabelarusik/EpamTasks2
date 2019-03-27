package by.epam.javatraining.krupin.tasks.maintask2.model.data.auto;

public class Toyota extends Car {
    public Toyota(){
        super();
    }

    public Toyota(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setName("Toyota");
    }

    public Toyota (Toyota toyota)  {
       super(toyota);
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
        return "Taxi {"+super.toString()+"}";
    }
}
