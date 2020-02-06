package cl.test.proyecto.service;

import cl.test.proyecto.dto.CourseDto;
import cl.test.proyecto.exception.NotSaveException;

public interface ICourseService {
    CourseDto saveCourse(CourseDto courseDto) throws NotSaveException;
}
