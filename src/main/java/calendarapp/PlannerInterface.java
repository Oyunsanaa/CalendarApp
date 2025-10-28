package main.java.calendarapp;

import java.time.LocalDateTime;
import java.util.List;

public interface PlannerInterface {
    boolean scheduleMeeting(Meeting meeting);

    boolean scheduleBreak(Employee employee, LocalDateTime start, LocalDateTime end);

    boolean isRoomAvailable(Room room, LocalDateTime start, LocalDateTime end);

    boolean isEmployeeAvailable(Employee employee, LocalDateTime start, LocalDateTime end);

    List<Meeting> getMeetingsForRoom(Room room);

    List<Meeting> getMeetingsForEmployee(Employee employee);
}
