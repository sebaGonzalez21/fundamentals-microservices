package cl.test.proyecto.dto;
import java.io.Serializable;
import java.util.Date;

public class StudentDto implements Serializable {

    private static final long serialVersionUID = 7960257213890939184L;
    private Long idStudentDto;
    private String dniStudentDto;
    private String nameStudentDto;
    private String lastNameStudentDto;
    private int ageStudentDto;
    private Date dateCreationStudentDto;
    private Date dateUpdateStudentDto;
    private byte activeStudentDto;

    public StudentDto(Long idStudentDto,String dniStudentDto,String nameStudentDto,String lastNameStudentDto,int ageStudentDto,Date dateCreationStudentDto,Date dateUpdateStudentDto,byte activeStudentDto){
        this.idStudentDto = idStudentDto;
        this.dniStudentDto = dniStudentDto;
        this.nameStudentDto = nameStudentDto;
        this.lastNameStudentDto = lastNameStudentDto;
        this.ageStudentDto = ageStudentDto;
        this.dateCreationStudentDto = dateCreationStudentDto;
        this.dateUpdateStudentDto = dateUpdateStudentDto;
        this.activeStudentDto = activeStudentDto;
    }

    public StudentDto(){

    }

    public Long getIdStudentDto() {
        return idStudentDto;
    }

    public void setIdStudentDto(Long idStudentDto) {
        this.idStudentDto = idStudentDto;
    }

    public String getDniStudentDto() {
        return dniStudentDto;
    }

    public void setDniStudentDto(String dniStudentDto) {
        this.dniStudentDto = dniStudentDto;
    }

    public String getNameStudentDto() {
        return nameStudentDto;
    }

    public void setNameStudentDto(String nameStudentDto) {
        this.nameStudentDto = nameStudentDto;
    }

    public String getLastNameStudentDto() {
        return lastNameStudentDto;
    }

    public void setLastNameStudentDto(String lastNameStudentDto) {
        this.lastNameStudentDto = lastNameStudentDto;
    }

    public int getAgeStudentDto() {
        return ageStudentDto;
    }

    public void setAgeStudentDto(int ageStudentDto) {
        this.ageStudentDto = ageStudentDto;
    }

    public Date getDateCreationStudentDto() {
        return dateCreationStudentDto;
    }

    public void setDateCreationStudentDto(Date dateCreationStudentDto) {
        this.dateCreationStudentDto = dateCreationStudentDto;
    }

    public Date getDateUpdateStudentDto() {
        return dateUpdateStudentDto;
    }

    public void setDateUpdateStudentDto(Date dateUpdateStudentDto) {
        this.dateUpdateStudentDto = dateUpdateStudentDto;
    }

    public byte getActiveStudentDto() {
        return activeStudentDto;
    }

    public void setActiveStudentDto(byte activeStudentDto) {
        this.activeStudentDto = activeStudentDto;
    }
}
