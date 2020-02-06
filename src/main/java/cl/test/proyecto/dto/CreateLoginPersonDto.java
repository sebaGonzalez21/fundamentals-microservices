package cl.test.proyecto.dto;

import java.io.Serializable;

public class CreateLoginPersonDto extends LoginDto implements Serializable {


    private static final long serialVersionUID = -3327053474111352254L;
    private Long idStudentDto;
    private String dniDto;
    private String nameDto;
    private String lastNameDto;
    private int ageDto;

    public Long getIdStudentDto() {
        return idStudentDto;
    }

    public void setIdStudentDto(Long idStudentDto) {
        this.idStudentDto = idStudentDto;
    }

    public String getDniDto() {
        return dniDto;
    }

    public void setDniDto(String dniDto) {
        this.dniDto = dniDto;
    }

    public String getNameDto() {
        return nameDto;
    }

    public void setNameDto(String nameDto) {
        this.nameDto = nameDto;
    }

    public String getLastNameDto() {
        return lastNameDto;
    }

    public void setLastNameDto(String lastNameDto) {
        this.lastNameDto = lastNameDto;
    }

    public int getAgeDto() {
        return ageDto;
    }

    public void setAgeDto(int ageDto) {
        this.ageDto = ageDto;
    }
}
