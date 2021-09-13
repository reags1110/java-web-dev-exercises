package exercises.school;

import java.util.HashMap;

public class Course {
    private HashMap<String, Integer> students;
    private String courseName;
    private double crn;
    private String courseTime;
    private String courseDate;
    private String teacher;

    @Override
    public String toString() {
        return "Course{" +
                "students=" + students +
                ", courseName='" + courseName + '\'' +
                ", crn=" + crn +
                ", courseTime='" + courseTime + '\'' +
                ", courseDate='" + courseDate + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    public HashMap<String, Integer> getStudents() {
        return students;
    }

    public void setStudents(HashMap<String, Integer> students) {
        this.students = students;
    }

    public Course(String courseName, double crn, String courseTime, String courseDate, String teacher) {
        this.courseName = courseName;
        this.crn = crn;
        this.courseTime = courseTime;
        this.courseDate = courseDate;
        this.teacher = teacher;
    }

    public HashMap AddStudent(String studentName, Integer studentId) {
        Student student = new Student();
        student.setName(studentName);
        student.setStudentId(studentId);
        this.students.put(studentName, studentId);
        return students;
    }

}