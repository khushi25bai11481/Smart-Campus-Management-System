package service;

import model.Course;
import java.util.ArrayList;

public class CourseService {

    private ArrayList<Course> courses = new ArrayList<>();

    // Add a new course
    public void addCourse(Course course) {

        for (Course c : courses) {

            if (c.getCourseId() == course.getCourseId()) {
                System.out.println("Course ID already exists.");
                return;
            }
        }

        courses.add(course);

        System.out.println("Course added successfully.");
    }

    // Display all courses
    public void displayAllCourses() {

        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }

        System.out.println("\n===== ALL COURSES =====");

        for (Course course : courses) {
            course.displayCourse();
        }
    }

    // Search course by ID
    public void searchCourse(int courseId) {

        for (Course course : courses) {

            if (course.getCourseId() == courseId) {

                System.out.println("\nCourse found:");
                course.displayCourse();

                return;
            }
        }

        System.out.println("Course not found.");
    }
}