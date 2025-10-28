package main.java.calendarapp;

public class Employee {
    private String name;
    private boolean available = true;

    public Employee(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }
}
