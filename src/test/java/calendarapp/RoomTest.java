package test.java.calendarapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.calendarapp.Room;

public class RoomTest {

    @Test
    public void testRoomAvailability() {
        Room room = new Room("A101");
        assertTrue(room.isAvailable());
        room.setAvailable(false);
        assertFalse(room.isAvailable());
    }

    @Test
    public void testRoomName() {
        Room room = new Room("B202");
        assertEquals("B202", room.getName());
    }
}