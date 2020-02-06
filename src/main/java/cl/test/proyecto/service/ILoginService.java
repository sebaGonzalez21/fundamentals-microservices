package cl.test.proyecto.service;

import cl.test.proyecto.dto.LoginSessionDto;
import cl.test.proyecto.dto.ResLoginSessionDto;
import cl.test.proyecto.exception.UnauthorizedException;

public interface ILoginService {
    ResLoginSessionDto sessionStudent(LoginSessionDto loginSessionDto) throws UnauthorizedException;
    ResLoginSessionDto sessionTeacher(LoginSessionDto loginSessionDto) throws UnauthorizedException;
}
