package cl.test.proyecto.model;

import javax.persistence.*;

@Entity
@Table(name = "GRADES_CONTROLS")
public class GradeControl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GRADE_CONTROL", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_TEACHER_STUDENT", updatable = false, nullable = false)
    private TeacherStudent teacherStudent;

    @Column(name = "GRADE", nullable = false)
    private double grade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TeacherStudent getTeacherStudent() {
        return teacherStudent;
    }

    public void setTeacherStudent(TeacherStudent teacherStudent) {
        this.teacherStudent = teacherStudent;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
