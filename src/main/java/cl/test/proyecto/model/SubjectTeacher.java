package cl.test.proyecto.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SUBJECTS_TEACHERS")
public class SubjectTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUBJECT_TEACHER_BIGINT", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_TEACHER", updatable = false, nullable = false)
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "ID_SUBJECT", updatable = false, nullable = false)
    private Subject subject;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subjectTeacher")
    private List<TeacherStudent> teacherStudent;


    public SubjectTeacher(){

    }
    public SubjectTeacher(Long id,Teacher teacher,Subject subject){
        this.id = id;
        this.teacher = teacher;
        this.subject = subject;
    }
    public SubjectTeacher(Teacher teacher,Subject subject){
        this.teacher = teacher;
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<TeacherStudent> getTeacherStudent() {
        return teacherStudent;
    }

    public void setTeacherStudent(List<TeacherStudent> teacherStudent) {
        this.teacherStudent = teacherStudent;
    }
}
