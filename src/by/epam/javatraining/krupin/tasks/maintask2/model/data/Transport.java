package by.epam.javatraining.krupin.tasks.maintask2.model.data;

import by.epam.javatraining.krupin.tasks.maintask2.model.logic.ClassChecker;

import java.util.Objects;

public abstract class Transport {

    private int cost;
    private double fuel_flow;
    private int age;
    private int passengerCount;
    private String name;
    private String color;

    public Transport() {
    }

    public Transport(int cost, double fuel_flow, int age) throws Exception {
        ClassChecker.checkPositiveNumber(cost, fuel_flow, age);
        this.cost = cost;
        this.fuel_flow = fuel_flow;
        this.age = age;
    }

    public Transport(Transport transport) {
        this.cost = transport.cost;
        this.color = transport.color;
        this.age = transport.age;
        this.passengerCount = transport.passengerCount;
        this.name = transport.name;
        this.fuel_flow = transport.fuel_flow;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) throws Exception {
        ClassChecker.checkPositiveNumber(cost);
        this.cost = cost;
    }

    public double getFuel_flow() {
        return fuel_flow;
    }

    public void setFuel_flow(double fuel_flow) throws Exception {
        ClassChecker.checkPositiveNumber(fuel_flow);
        this.fuel_flow = fuel_flow;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        ClassChecker.checkPositiveNumber(age);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) throws Exception {
        ClassChecker.checkPositiveNumber(passengerCount);
        this.passengerCount = passengerCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return cost == transport.cost &&
                Double.compare(transport.fuel_flow, fuel_flow) == 0 &&
                age == transport.age &&
                passengerCount == transport.passengerCount &&
                Objects.equals(name, transport.name) &&
                Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, fuel_flow, age, passengerCount, name, color);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name=");
        stringBuilder.append(name);
        stringBuilder.append(" ,cost = ");
        stringBuilder.append(cost);
        stringBuilder.append(" ,age=");
        stringBuilder.append(age);
        stringBuilder.append(" ,fuel_flow=");
        stringBuilder.append(fuel_flow);
        stringBuilder.append(" ,passenger count=");
        stringBuilder.append(passengerCount);
        stringBuilder.append(" ,color=");
        stringBuilder.append(color);
        return stringBuilder.toString();
    }
}
