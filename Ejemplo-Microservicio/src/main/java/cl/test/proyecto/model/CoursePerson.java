package cl.test.proyecto.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COURSES_PERSONS")
public class CoursePerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COURSE_PERSON", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_STUDENT", updatable = false, nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "ID_TEACHER", updatable = false, nullable = false)
    private Teacher teacher;

    @Column(name = "DATE_CREATION", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateCreation;

    @ManyToOne
    @JoinColumn(name = "ID_COURSE", updatable = false, nullable = false)
    private Course course;

    @Column(name = "ACTIVE", length = 1, nullable = false)
    private byte active;

    public CoursePerson(Student student, Teacher teacher, Course course, Date dateCreation, byte active){
        this.student = student;
        this.teacher = teacher;
        this.dateCreation = dateCreation;
        this.course = course;
        this.active = active;
    }

    public CoursePerson(){
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }
}
