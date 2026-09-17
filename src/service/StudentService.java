package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {

        for (Student s : students) {
            if (s.getStudentId() == student.getStudentId()) {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== ALL STUDENTS =====");

        for (Student student : students) {
            student.displayStudent();
        }
    }

    public void searchStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {
                System.out.println("\nStudent found:");
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }
}