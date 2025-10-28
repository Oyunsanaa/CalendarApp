package main.java.calendarapp;

import java.time.LocalDateTime;

public class Meeting {
    private String title;
    private Room room;
    private Employee organizer;
    private LocalDateTime start;
    private LocalDateTime end;

    public Meeting(String title, Room room, Employee organizer, LocalDateTime start, LocalDateTime end) {
        this.title = title;
        this.room = room;
        this.organizer = organizer;
        this.start = start;
        this.end = end;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public Room getRoom() {
        return room;
    }

    public Employee getOrganizer() {
        return organizer;
    }

    public String getTitle() {
        return title;
    }
}
