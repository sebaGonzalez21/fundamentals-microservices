package cl.test.proyecto.service;

import cl.test.proyecto.dto.CoursePersonDto;
import cl.test.proyecto.dto.ResCoursePersonDto;
import cl.test.proyecto.exception.NotSaveException;

public interface ICoursePersonService {
    ResCoursePersonDto saveCoursePerson(CoursePersonDto coursePersonDto) throws NotSaveException;
}
