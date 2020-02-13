package cl.test.proyecto.imp;

import cl.test.proyecto.dto.SubjectTeacherDto;
import cl.test.proyecto.exception.ExistedException;
import cl.test.proyecto.exception.NotSaveException;
import cl.test.proyecto.model.Subject;
import cl.test.proyecto.model.SubjectTeacher;
import cl.test.proyecto.model.Teacher;
import cl.test.proyecto.repository.ISubjectRepository;
import cl.test.proyecto.repository.ISubjectTeacherRepository;
import cl.test.proyecto.repository.ITeacherRepository;
import cl.test.proyecto.service.ISubjectTeacherService;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectTeacherImp implements ISubjectTeacherService {

    @Autowired
    private ISubjectRepository iSubjectRepository;

    @Autowired
    private ITeacherRepository iTeacherRepository;

    @Autowired
    private ISubjectTeacherRepository iSubjectTeacherRepository;

    @Override
    public SubjectTeacherDto saveSubjectTeacher(SubjectTeacherDto subjectTeacherDto) throws ExistedException, NotSaveException {
        try {

            if(null != subjectTeacherDto.getIdSubjectDto() && null != subjectTeacherDto.getIdTeacherDto()){

                Teacher teacher = iTeacherRepository.findByIdTeacher(subjectTeacherDto.getIdTeacherDto());

                Optional<Subject> subject = iSubjectRepository.findById(subjectTeacherDto.getIdSubjectDto());

                if(null != teacher && subject.isPresent()){
                    Subject subjectLocal = new Subject(subject.get().getId(),subject.get().getName());
                    SubjectTeacher subjectTeacher = new SubjectTeacher(teacher,subjectLocal);
                    iSubjectTeacherRepository.save(subjectTeacher);
                    return new SubjectTeacherDto(subjectTeacher.getId(),subjectTeacher.getTeacher().getIdTeacher(),subjectTeacher.getSubject().getId());
                }else{
                    throw new NotSaveException(Constant.NOT_SAVE_EXCEPTION);
                }

            }else{
                throw new NotSaveException(Constant.NOT_SAVE_EXCEPTION);
            }

        }catch (NotSaveException ex){
            throw new NotSaveException(ex.getMessage());
        }
    }
}
