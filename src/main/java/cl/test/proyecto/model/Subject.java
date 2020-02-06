package cl.test.proyecto.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "SUBJECTS")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUBJECT", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, unique = true,length = 30)
    @Size(min = 2, max = 30)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<SubjectTeacher> subjectTeachers;

    public Subject(){

    }

    public Subject(Long id,String name){
        this.id = id;
        this.name = name;
    }

    public Subject(String name ){
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectTeacher> getSubjectTeachers() {
        return subjectTeachers;
    }

    public void setSubjectTeachers(List<SubjectTeacher> subjectTeachers) {
        this.subjectTeachers = subjectTeachers;
    }
}
