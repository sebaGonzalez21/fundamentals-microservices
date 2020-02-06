package cl.test.proyecto.dto;

import java.io.Serializable;

public class SubjectDto implements Serializable {


    private static final long serialVersionUID = 1780682764796570411L;
    private Long idDto;
    private String nameDto;

    public SubjectDto(){}

    public SubjectDto(Long idDto, String nameDto){
        this.idDto = idDto;
        this.nameDto = nameDto;
    }

    public SubjectDto(String nameDto){
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
