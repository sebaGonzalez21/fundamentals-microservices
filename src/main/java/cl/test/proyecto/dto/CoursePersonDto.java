package cl.test.proyecto.dto;

import java.io.Serializable;
import java.util.Date;

public class CoursePersonDto implements Serializable {

    private static final long serialVersionUID = 8701050712714129332L;
    private Long idCoursePersonDto;
    private Long idStudentDto;
    private Long idTeacherDto;
    private Date dateCreation;
    private Long idCourseDto;
    private byte activeCoursePersonDto;

    public Long getIdCoursePersonDto() {
        return idCoursePersonDto;
    }

    public void setIdCoursePersonDto(Long idCoursePersonDto) {
        this.idCoursePersonDto = idCoursePersonDto;
    }

    public Long getIdStudentDto() {
        return idStudentDto;
    }

    public void setIdStudentDto(Long idStudentDto) {
        this.idStudentDto = idStudentDto;
    }

    public Long getIdTeacherDto() {
        return idTeacherDto;
    }

    public void setIdTeacherDto(Long idTeacherDto) {
        this.idTeacherDto = idTeacherDto;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Long getIdCourseDto() {
        return idCourseDto;
    }

    public void setIdCourseDto(Long idCourseDto) {
        this.idCourseDto = idCourseDto;
    }

    public byte getActiveCoursePersonDto() {
        return activeCoursePersonDto;
    }

    public void setActiveCoursePersonDto(byte activeCoursePersonDto) {
        this.activeCoursePersonDto = activeCoursePersonDto;
    }
}
