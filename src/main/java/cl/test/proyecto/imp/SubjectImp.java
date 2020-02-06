package cl.test.proyecto.imp;

import cl.test.proyecto.dto.SubjectDto;
import cl.test.proyecto.exception.ExistedException;
import cl.test.proyecto.exception.NotSaveException;
import cl.test.proyecto.model.Subject;
import cl.test.proyecto.repository.ISubjectRepository;
import cl.test.proyecto.service.ISubjectService;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectImp implements ISubjectService {

    @Autowired
    private ISubjectRepository iSubjectRepository;

    @Override
    public SubjectDto saveSubject(SubjectDto subjectDto) throws NotSaveException, ExistedException {
        try {
            if(null != subjectDto.getNameDto() && subjectDto.getNameDto().trim().length()>0){

                Optional<Subject> subjectName = iSubjectRepository.findByName(subjectDto.getNameDto());
                if(!subjectName.isPresent()){
                    Subject subject =new Subject(subjectDto.getNameDto());
                    iSubjectRepository.save(subject);
                    return new SubjectDto(subject.getId(),subjectDto.getNameDto());
                }else{
                    throw new ExistedException(Constant.EXISTED_VALUE_EXCEPTION);
                }

            }else{
                throw new NotSaveException(Constant.NOT_SAVE_EXCEPTION);
            }

        }catch (ExistedException ex){
            throw new ExistedException(ex.getMessage());
        }catch (NotSaveException ex){
            throw new NotSaveException(ex.getMessage());
        }
    }


}
