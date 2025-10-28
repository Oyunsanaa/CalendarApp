package test.java.calendarapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import main.java.calendarapp.Meeting;
import main.java.calendarapp.Employee;
import main.java.calendarapp.Room;

public class MeetingTest {

    @Test
    public void testValidMeetingCreation() {
        Room r = new Room("A1");
        Employee e = new Employee("John");
        LocalDateTime start = LocalDateTime.of(2025, 10, 28, 9, 0);
        LocalDateTime end = LocalDateTime.of(2025, 10, 28, 10, 0);
        Meeting m = new Meeting("Planning", r, e, start, end);

        assertEquals("Planning", m.getTitle());
        assertEquals(r, m.getRoom());
        assertEquals(e, m.getOrganizer());
        assertEquals(start, m.getStart());
        assertEquals(end, m.getEnd());
    }

    @Test
    public void testInvalidMeetingThrowsException() {
        Room r = new Room("B1");
        Employee e = new Employee("Lisa");
        LocalDateTime start = LocalDateTime.of(2025, 10, 28, 11, 0);
        LocalDateTime end = LocalDateTime.of(2025, 10, 28, 10, 0);

        assertThrows(IllegalArgumentException.class, () -> {
            new Meeting("Bad", r, e, start, end);
        });
    }
}
