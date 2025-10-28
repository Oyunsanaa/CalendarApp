package test.java.calendarapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.calendarapp.Employee;

public class EmployeeTest {

    @Test
    public void testEmployeeAvailability() {
        Employee emp = new Employee("Alice");
        assertTrue(emp.isAvailable());
        emp.setAvailable(false);
        assertFalse(emp.isAvailable());
    }

    @Test
    public void testEmployeeName() {
        Employee emp = new Employee("Bob");
        assertEquals("Bob", emp.getName());
    }
}
