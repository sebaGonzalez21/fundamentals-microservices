package cl.test.proyecto.dto;

import java.io.Serializable;

public class SubjectTeacherDto implements Serializable {


    private static final long serialVersionUID = -8098587480480179415L;
    private Long idDto;
    private Long idTeacherDto;
    private Long idSubjectDto;

    public SubjectTeacherDto(){

    }

    public SubjectTeacherDto(Long idDto,Long idTeacherDto,Long idSubjectDto){
        this.idDto = idDto;
        this.idTeacherDto = idTeacherDto;
        this.idSubjectDto = idSubjectDto;
    }

    public SubjectTeacherDto(Long idTeacherDto,Long idSubjectDto){
        this.idTeacherDto = idTeacherDto;
        this.idSubjectDto = idSubjectDto;
    }


    public Long getIdDto() {
        return idDto;
    }

    public void setIdDto(Long idDto) {
        this.idDto = idDto;
    }

    public Long getIdTeacherDto() {
        return idTeacherDto;
    }

    public void setIdTeacherDto(Long idTeacherDto) {
        this.idTeacherDto = idTeacherDto;
    }

    public Long getIdSubjectDto() {
        return idSubjectDto;
    }

    public void setIdSubjectDto(Long idSubjectDto) {
        this.idSubjectDto = idSubjectDto;
    }
}
