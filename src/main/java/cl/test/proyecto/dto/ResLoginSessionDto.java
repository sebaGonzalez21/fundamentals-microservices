package cl.test.proyecto.dto;

import java.io.Serializable;

public class ResLoginSessionDto implements Serializable {


    private static final long serialVersionUID = -2478388556796333599L;
    private String emailDto;
    private Long idDto;
    private String dniDto;
    private String nameDto;
    private String lastNameDto;
    private int ageDto;

    public ResLoginSessionDto(String emailDto,Long idDto,String dniDto,String nameDto,String lastNameDto,int ageDto ){
        this.emailDto = emailDto;
        this.idDto = idDto;
        this.dniDto = dniDto;
        this.nameDto = nameDto;
        this.lastNameDto = lastNameDto;
        this.ageDto = ageDto;
    }

    public ResLoginSessionDto(){
    }

    public String getEmailDto() {
        return emailDto;
    }

    public void setEmailDto(String emailDto) {
        this.emailDto = emailDto;
    }

    public Long getIdDto() {
        return idDto;
    }

    public void setIdDto(Long idDto) {
        this.idDto = idDto;
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
