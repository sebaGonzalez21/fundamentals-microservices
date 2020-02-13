package cl.test.proyecto.service;

import cl.test.proyecto.dto.SubjectTeacherDto;
import cl.test.proyecto.exception.ExistedException;
import cl.test.proyecto.exception.NotSaveException;

public interface ISubjectTeacherService {
    SubjectTeacherDto saveSubjectTeacher(SubjectTeacherDto subjectTeacherDto) throws ExistedException, NotSaveException;

}
