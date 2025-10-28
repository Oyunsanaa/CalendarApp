package main.java.calendarapp;

public class Room {
    private String name;
    private boolean available = true;

    public Room(String name) {
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
