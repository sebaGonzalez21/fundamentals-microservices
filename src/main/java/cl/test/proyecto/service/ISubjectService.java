package cl.test.proyecto.service;

import cl.test.proyecto.dto.SubjectDto;
import cl.test.proyecto.exception.ExistedException;
import cl.test.proyecto.exception.NotSaveException;

public interface ISubjectService {
    SubjectDto saveSubject(SubjectDto subjectDto) throws NotSaveException, ExistedException;
}
