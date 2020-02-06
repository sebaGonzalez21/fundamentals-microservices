package cl.test.proyecto.model;


import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "COURSES")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COURSE", nullable = false)
    private Long idCourse;

    @Column(name = "NAME",nullable = false, length = 30, unique = true)
    @Size(min = 5, max = 30)
    private String name;

    public Course(){
    }

    public Course(Long idCourse, String name){
        this.idCourse = idCourse;
        this.name = name;
    }

    public Course(String name){
        this.name = name;
    }


    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
