package cl.test.proyecto.dto;

import cl.test.proyecto.model.Teacher;

import java.io.Serializable;
import java.util.Date;

public class TeacherDto implements Serializable {


    private static final long serialVersionUID = 7400413771960630756L;
    private Long idTeacherDto;
    private String dniTeacherDto;
    private String nameTeacherDto;
    private String lastNameTeacherDto;
    private int ageTeacherDto;
    private Date dateCreationTeacherDto;
    private Date dateUpdateTeacherDto;
    private byte activeTeacherDto;

    public TeacherDto(Long idTeacherDto,String dniTeacherDto,String nameTeacherDto,String lastNameTeacherDto,int ageTeacherDto,Date dateCreationTeacherDto,Date dateUpdateTeacherDto,byte activeTeacherDto){
        this.idTeacherDto = idTeacherDto;
        this.dniTeacherDto = dniTeacherDto;
        this.nameTeacherDto = nameTeacherDto;
        this.lastNameTeacherDto = lastNameTeacherDto;
        this.ageTeacherDto = ageTeacherDto;
        this.dateCreationTeacherDto = dateCreationTeacherDto;
        this.dateUpdateTeacherDto = dateUpdateTeacherDto;
        this.activeTeacherDto = activeTeacherDto;
    }

    public TeacherDto(){

    }
    public Long getIdTeacherDto() {
        return idTeacherDto;
    }

    public void setIdTeacherDto(Long idTeacherDto) {
        this.idTeacherDto = idTeacherDto;
    }

    public String getDniTeacherDto() {
        return dniTeacherDto;
    }

    public void setDniTeacherDto(String dniTeacherDto) {
        this.dniTeacherDto = dniTeacherDto;
    }

    public String getNameTeacherDto() {
        return nameTeacherDto;
    }

    public void setNameTeacherDto(String nameTeacherDto) {
        this.nameTeacherDto = nameTeacherDto;
    }

    public String getLastNameTeacherDto() {
        return lastNameTeacherDto;
    }

    public void setLastNameTeacherDto(String lastNameTeacherDto) {
        this.lastNameTeacherDto = lastNameTeacherDto;
    }

    public int getAgeTeacherDto() {
        return ageTeacherDto;
    }

    public void setAgeTeacherDto(int ageTeacherDto) {
        this.ageTeacherDto = ageTeacherDto;
    }

    public Date getDateCreationTeacherDto() {
        return dateCreationTeacherDto;
    }

    public void setDateCreationTeacherDto(Date dateCreationTeacherDto) {
        this.dateCreationTeacherDto = dateCreationTeacherDto;
    }

    public Date getDateUpdateTeacherDto() {
        return dateUpdateTeacherDto;
    }

    public void setDateUpdateTeacherDto(Date dateUpdateTeacherDto) {
        this.dateUpdateTeacherDto = dateUpdateTeacherDto;
    }

    public byte getActiveTeacherDto() {
        return activeTeacherDto;
    }

    public void setActiveTeacherDto(byte activeTeacherDto) {
        this.activeTeacherDto = activeTeacherDto;
    }
}
