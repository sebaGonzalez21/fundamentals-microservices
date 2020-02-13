package cl.test.proyecto.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_STUDENT")
    private Long idStudent;

    @Column(name = "DNI",length = 30, nullable = false, unique = true)
    @Size(min = 9, max = 10)
    private String dni;

    @Column(name = "NAME", length = 30,nullable = false)
    @Size(min = 3, max = 30)
    private String name;

    @Column(name = "LAST_NAME", length = 30, nullable = false)
    @Size(min = 3, max = 30)
    private String lastName;

    @Column(name = "AGE", length = 3,nullable = false)
    private int age;

    @Column(name = "DATE_CREATION", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateCreation;

    @Column(name = "DATE_UPDATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateUpdate;

    @Column(name = "ACTIVE", length = 1, nullable = false)
    private byte active;

    @OneToOne
    @JoinColumn(name = "ID_LOGIN", updatable = false, nullable = false)
    private Login login;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<TeacherStudent> teacherStudent;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<CoursePerson> coursePerson;

    public Student(){
    }

    public Student(String dni,String name,String lastName,int age, Date dateCreation,Date dateUpdate,byte active,Login login){
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dateCreation = dateCreation;
        this.dateUpdate = dateUpdate;
        this.active = active;
        this.login = login;
    }


    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public List<TeacherStudent> getTeacherStudent() {
        return teacherStudent;
    }

    public void setTeacherStudent(List<TeacherStudent> teacherStudent) {
        this.teacherStudent = teacherStudent;
    }

    public List<CoursePerson> getCoursePerson() {
        return coursePerson;
    }

    public void setCoursePerson(List<CoursePerson> coursePerson) {
        this.coursePerson = coursePerson;
    }
}
