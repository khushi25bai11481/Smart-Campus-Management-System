package service;

import model.Attendance;
import java.util.ArrayList;

public class AttendanceService {

    private ArrayList<Attendance> attendanceList =
            new ArrayList<>();

    public void addAttendance(Attendance attendance) {
        attendanceList.add(attendance);
        System.out.println("Attendance added successfully.");
    }

    public void displayAllAttendance() {

        if (attendanceList.isEmpty()) {
            System.out.println("No attendance records found.");
            return;
        }

        System.out.println("\n===== ATTENDANCE DETAILS =====");

        for (Attendance attendance : attendanceList) {
            attendance.displayAttendance();
        }
    }

    public void searchAttendance(int studentId) {

        for (Attendance attendance : attendanceList) {

            if (attendance.getStudentId() == studentId) {
                attendance.displayAttendance();
                return;
            }
        }

        System.out.println("Attendance record not found.");
    }
}