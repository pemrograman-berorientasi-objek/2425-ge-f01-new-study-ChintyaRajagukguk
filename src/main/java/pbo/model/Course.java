package pbo.model;

import javax.persistence.*;

/**
 * @author 12S23045 Chintya Reginauli Rajagukguk
 * @author 12S23023 Lenni Febriyani
 */

@Entity
@Table(name = "course")

public class Course {
    @Id
    @Column(name = "course_id", nullable = false, length = 255)
    private String courseId;

    @Column(name = "course_name", nullable = false, length = 255)
    private String courseName;

    @Column(name = "semester", nullable = false, length = 25)
    private int semester;
    @Column(name = "credit", nullable = false, length = 25)
    private int credit;

    public Course(String courseId, String courseName, int semester, int credit) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.semester = semester;
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return courseId + "|" + courseName + "|" + semester + "|" + credit;
    }
}