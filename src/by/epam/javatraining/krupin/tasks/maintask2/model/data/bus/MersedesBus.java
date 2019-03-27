package by.epam.javatraining.krupin.tasks.maintask2.model.data.bus;


public class MersedesBus extends Bus {
    public MersedesBus(){
        super();
    }

    public MersedesBus(int cost, double fuel_flow, int age) throws Exception {
        super(cost, fuel_flow, age);
        setName("Mersedes");
        setColor("Green");
        setPassengerCount(35);
        setBaggage(30);
        setTv(false);
        setCofe(false);
    }

    public MersedesBus (MersedesBus mersedesBus) {
        super(mersedesBus);
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
