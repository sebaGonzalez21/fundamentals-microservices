package cl.test.proyecto.imp;

import cl.test.proyecto.dto.CreateLoginPersonDto;
import cl.test.proyecto.dto.ResLoginSessionDto;
import cl.test.proyecto.exception.NotSaveException;
import cl.test.proyecto.model.Login;
import cl.test.proyecto.model.Student;
import cl.test.proyecto.repository.ILoginRepository;
import cl.test.proyecto.repository.IStudentRepository;
import cl.test.proyecto.security.Pbkdf2EncryptSecurity;
import cl.test.proyecto.service.IStudentService;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;

@Service
public class StudentImp implements IStudentService {

    @Autowired
    private Pbkdf2EncryptSecurity pbkdf2EncryptSecurity;

    @Autowired
    private IStudentRepository iStudentRepository;

    @Autowired
    private ILoginRepository iLoginRepository;


    @Override
    public ResLoginSessionDto saveStudent(CreateLoginPersonDto createLoginStudentDto) throws NotSaveException {
        Login login = null;
        ResLoginSessionDto resLoginSessionDto = null;
        try {
                if(null != createLoginStudentDto && null != createLoginStudentDto.getEmailDto() && null != createLoginStudentDto.getDniDto()){
                    login = new Login(createLoginStudentDto.getEmailDto(),pbkdf2EncryptSecurity.generateHashPassword(createLoginStudentDto.getPasswordDto())
                                     ,new Date(),new Date(),Constant.ACTIVE);
                    iLoginRepository.save(login);
                    if(null != login){
                        Student student = new Student(createLoginStudentDto.getDniDto(),createLoginStudentDto.getNameDto(),createLoginStudentDto.getLastNameDto(),
                                            createLoginStudentDto.getAgeDto(),new Date(),new Date(),Constant.ACTIVE,login);
                        iStudentRepository.save(student);
                        return resLoginSessionDto = new  ResLoginSessionDto(login.getEmail(),student.getIdStudent(),student.getDni(),student.getName(),
                                            student.getLastName(),student.getAge());
                    }else{
                        throw new NotSaveException(Constant.NOT_SAVE_EXCEPTION);
                    }
                }else{
                    throw new NotSaveException(Constant.NOT_SAVE_EXCEPTION);
                }
        }catch (NotSaveException ex){
            throw new NotSaveException(ex.getMessage());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return resLoginSessionDto;
    }
}
