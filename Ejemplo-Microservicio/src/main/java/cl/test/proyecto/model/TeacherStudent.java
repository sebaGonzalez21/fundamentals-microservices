package cl.test.proyecto.model;

import javax.persistence.*;

@Entity
@Table(name = "TEACHERS_STUDENTS")
public class TeacherStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TEACHER_STUDENT", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_SUBJECT_TEACHER", updatable = false, nullable = false)
    private SubjectTeacher subjectTeacher;

    @ManyToOne
    @JoinColumn(name = "ID_STUDENT", updatable = false, nullable = false)
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubjectTeacher getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(SubjectTeacher subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
