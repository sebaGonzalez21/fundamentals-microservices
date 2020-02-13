package cl.test.proyecto.service;

import cl.test.proyecto.dto.CreateLoginPersonDto;
import cl.test.proyecto.dto.ResLoginSessionDto;

public interface IStudentService {

    ResLoginSessionDto saveStudent(CreateLoginPersonDto createLoginStudentDto) throws Exception;

}
