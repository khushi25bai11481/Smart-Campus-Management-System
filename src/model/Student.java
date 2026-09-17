package model;

public class Student {

    private int studentId;
    private String name;
    private String email;
    private String department;

    public Student(int studentId, String name, String email, String department) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public void displayStudent() {

        System.out.println("-----------------------------------");
        System.out.println("Student ID  : " + studentId);
        System.out.println("Name        : " + name);
        System.out.println("Email       : " + email);
        System.out.println("Department  : " + department);
        System.out.println("-----------------------------------");
    }
}