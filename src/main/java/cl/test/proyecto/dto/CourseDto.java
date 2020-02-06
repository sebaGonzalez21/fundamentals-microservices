package cl.test.proyecto.dto;

import java.io.Serializable;

public class CourseDto implements Serializable {

    private static final long serialVersionUID = -3108608683434138802L;
    private Long idDto;
    private String nameDto;

    public CourseDto(){

    }

    public CourseDto(Long idDto,String nameDto){
        this.idDto = idDto;
        this.nameDto = nameDto;
    }

    public Long getIdDto() {
        return idDto;
    }

    public void setIdDto(Long idDto) {
        this.idDto = idDto;
    }

    public String getNameDto() {
        return nameDto;
    }

    public void setNameDto(String nameDto) {
        this.nameDto = nameDto;
    }
}
