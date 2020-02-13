package cl.test.proyecto.dto;

import cl.test.proyecto.model.Course;

import java.io.Serializable;
import java.util.Date;

public class ResCoursePersonDto implements Serializable {

    private static final long serialVersionUID = -4903091375326630101L;
    private Long idCoursePersonDto;
    private StudentDto studentDto;
    private TeacherDto teacherDto;
    private Date dateCreation;
    private Course course;
    private byte activeCoursePersonDto;

    public ResCoursePersonDto(Long idCoursePersonDto, StudentDto studentDto, TeacherDto teacherDto, Date dateCreation, Course course, byte activeCoursePersonDto){
        this.idCoursePersonDto = idCoursePersonDto;
        this.studentDto = studentDto;
        this.teacherDto = teacherDto;
        this.dateCreation = dateCreation;
        this.course = course;
        this.activeCoursePersonDto = activeCoursePersonDto;
    }

    public ResCoursePersonDto(){

    }

    public Long getIdCoursePersonDto() {
        return idCoursePersonDto;
    }

    public void setIdCoursePersonDto(Long idCoursePersonDto) {
        this.idCoursePersonDto = idCoursePersonDto;
    }

    public StudentDto getStudentDto() {
        return studentDto;
    }

    public void setStudentDto(StudentDto studentDto) {
        this.studentDto = studentDto;
    }

    public TeacherDto getTeacherDto() {
        return teacherDto;
    }

    public void setTeacherDto(TeacherDto teacherDto) {
        this.teacherDto = teacherDto;
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

    public byte getActiveCoursePersonDto() {
        return activeCoursePersonDto;
    }

    public void setActiveCoursePersonDto(byte activeCoursePersonDto) {
        this.activeCoursePersonDto = activeCoursePersonDto;
    }
}
