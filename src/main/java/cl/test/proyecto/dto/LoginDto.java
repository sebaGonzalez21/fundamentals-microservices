package cl.test.proyecto.dto;
import java.io.Serializable;
import java.util.Date;

public class LoginDto implements Serializable {

    private static final long serialVersionUID = 2994936387683374407L;
    private Long idDto;
    private String emailDto;
    private String passwordDto;
    private Date dateCreationDto;
    private Date dateUpdateDto;
    private Byte activeDto;

    public Long getIdDto() {
        return idDto;
    }

    public void setIdDto(Long idDto) {
        this.idDto = idDto;
    }

    public String getEmailDto() {
        return emailDto;
    }

    public void setEmailDto(String emailDto) {
        this.emailDto = emailDto;
    }

    public String getPasswordDto() {
        return passwordDto;
    }

    public void setPasswordDto(String passwordDto) {
        this.passwordDto = passwordDto;
    }

    public Date getDateCreationDto() {
        return dateCreationDto;
    }

    public void setDateCreationDto(Date dateCreationDto) {
        this.dateCreationDto = dateCreationDto;
    }

    public Date getDateUpdateDto() {
        return dateUpdateDto;
    }

    public void setDateUpdateDto(Date dateUpdateDto) {
        this.dateUpdateDto = dateUpdateDto;
    }

    public Byte getActiveDto() {
        return activeDto;
    }

    public void setActiveDto(Byte activeDto) {
        this.activeDto = activeDto;
    }
}
