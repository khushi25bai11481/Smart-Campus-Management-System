package model;

public class Attendance {

    private int studentId;
    private String courseName;
    private int totalClasses;
    private int attendedClasses;

    public Attendance(int studentId, String courseName,
                      int totalClasses, int attendedClasses) {

        this.studentId = studentId;
        this.courseName = courseName;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    public double getAttendancePercentage() {
        if (totalClasses == 0) {
            return 0;
        }

        return (attendedClasses * 100.0) / totalClasses;
    }

    public void displayAttendance() {
        System.out.println("-----------------------------------");
        System.out.println("Student ID       : " + studentId);
        System.out.println("Course           : " + courseName);
        System.out.println("Total Classes    : " + totalClasses);
        System.out.println("Attended Classes : " + attendedClasses);

        System.out.printf("Attendance       : %.2f%%%n",
                getAttendancePercentage());

        System.out.println("-----------------------------------");
    }
}