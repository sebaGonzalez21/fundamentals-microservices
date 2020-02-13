package cl.test.proyecto.service;

import cl.test.proyecto.dto.CreateLoginPersonDto;
import cl.test.proyecto.dto.ResLoginSessionDto;

public interface ITeacherService {
    ResLoginSessionDto createTeacher(CreateLoginPersonDto createLoginPersonDto) throws Exception;
}
