package cl.test.proyecto.dto;

import java.io.Serializable;

public class LoginSessionDto implements Serializable {

    private static final long serialVersionUID = 6690358112404391431L;
    private String emailDto;
    private String passwordDto;

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
}
