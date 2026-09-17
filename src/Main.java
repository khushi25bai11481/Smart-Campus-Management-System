import model.Student;
import model.Complaint;
import model.Course;
import model.Attendance;
import model.Facility;

import service.StudentService;
import service.ComplaintService;
import service.CourseService;
import service.AttendanceService;
import service.FacilityService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("       SMART CAMPUS MANAGEMENT SYSTEM");
        System.out.println("==========================================");

        // ==============================
        // 1. STUDENT MANAGEMENT
        // ==============================

        StudentService studentService = new StudentService();

        Student student = new Student(
                101,
                "Khushi",
                "khushi@example.com",
                "AI & ML"
        );

        studentService.addStudent(student);

        System.out.println("\n===== STUDENT DETAILS =====");
        studentService.displayAllStudents();


        // ==============================
        // 2. COMPLAINT MANAGEMENT
        // ==============================

        ComplaintService complaintService = new ComplaintService();

        Complaint complaint = new Complaint(
                1001,
                101,
                "Classroom projector is not working."
        );

        complaintService.addComplaint(complaint);

        System.out.println("\n===== COMPLAINT DETAILS =====");
        complaintService.displayAllComplaints();

        System.out.println("\n===== UPDATE COMPLAINT =====");

        complaintService.updateComplaintStatus(
                1001,
                "Resolved"
        );

        complaintService.searchComplaint(1001);


        // ==============================
        // 3. COURSE MANAGEMENT
        // ==============================

        CourseService courseService = new CourseService();

        Course course = new Course(
                201,
                "Programming in Java",
                "Dr. Sharma",
                4
        );

        courseService.addCourse(course);

        System.out.println("\n===== COURSE DETAILS =====");
        courseService.displayAllCourses();

        System.out.println("\n===== SEARCH COURSE =====");
        courseService.searchCourse(201);


        // ==============================

        System.out.println("\n==========================================");
        // ==============================
// 4. ATTENDANCE MANAGEMENT
// ==============================

AttendanceService attendanceService = new AttendanceService();

Attendance attendance = new Attendance(
        101,
        "Programming in Java",
        40,
        36
);

attendanceService.addAttendance(attendance);

System.out.println("\n===== ATTENDANCE DETAILS =====");
attendanceService.displayAllAttendance();

System.out.println("\n===== SEARCH ATTENDANCE =====");
attendanceService.searchAttendance(101);
 
 // =============================
// FACILITY MANAGEMENT
// =============================

FacilityService facilityService = new FacilityService();

Facility facility = new Facility(
        501,
        "Computer Lab",
        "Block A - 2nd Floor",
        "Available"
);

facilityService.addFacility(facility);

System.out.println("\n===== FACILITY DETAILS =====");
facilityService.displayAllFacilities();

System.out.println("\n===== SEARCH FACILITY =====");
facilityService.searchFacility(501);
System.out.println("================================");
System.out.println("       PROGRAM EXECUTED SUCCESSFULLY");
System.out.println("================================");
System.out.println("\n===== SMART CAMPUS MANAGEMENT SYSTEM =====");
System.out.println("1. Student Management");
System.out.println("2. Course Management");
System.out.println("3. Complaint Management");
System.out.println("4. Attendance Management");
System.out.println("5. Facility Management");
System.out.println("6. Exit");

System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) {

    case 1:
        System.out.println("\n===== STUDENT MANAGEMENT =====");
        studentService.displayAllStudents();
        break;

    case 2:
        System.out.println("\n===== COURSE MANAGEMENT =====");
        courseService.displayAllCourses();
        break;

    case 3:
        System.out.println("\n===== COMPLAINT MANAGEMENT =====");
        complaintService.displayAllComplaints();
        break;

    case 4:
        System.out.println("\n===== ATTENDANCE MANAGEMENT =====");
        attendanceService.displayAllAttendance();
        break;

    case 5:
        System.out.println("\n===== FACILITY MANAGEMENT =====");
        facilityService.displayAllFacilities();
        break;

    case 6:
        System.out.println("Exiting program...");
        break;

    default:
        System.out.println("Invalid choice.");
}

scanner.close();
    }
} 