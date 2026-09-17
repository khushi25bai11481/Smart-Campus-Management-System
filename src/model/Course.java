package model;

public class Course {

    private int courseId;
    private String courseName;
    private String instructor;
    private int credits;

    public Course(int courseId, String courseName,
                  String instructor, int credits) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCredits() {
        return credits;
    }

    public void displayCourse() {

        System.out.println("-----------------------------------");
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Instructor  : " + instructor);
        System.out.println("Credits     : " + credits);
        System.out.println("-----------------------------------");
    }
}