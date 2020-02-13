package cl.test.proyecto.imp;

import cl.test.proyecto.dto.CreateLoginPersonDto;
import cl.test.proyecto.dto.ResLoginSessionDto;
import cl.test.proyecto.exception.NotSaveException;
import cl.test.proyecto.model.Login;
import cl.test.proyecto.model.Teacher;
import cl.test.proyecto.repository.ILoginRepository;
import cl.test.proyecto.repository.ITeacherRepository;
import cl.test.proyecto.security.Pbkdf2EncryptSecurity;
import cl.test.proyecto.service.ITeacherService;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;

@Service
public class TeacherImp implements ITeacherService {

    @Autowired
    private Pbkdf2EncryptSecurity pbkdf2EncryptSecurity;

    @Autowired
    private ITeacherRepository iTeacherRepository;

    @Autowired
    private ILoginRepository iLoginRepository;


    @Override
    public ResLoginSessionDto createTeacher(CreateLoginPersonDto createLoginPersonDto) throws NotSaveException {
        Login login = null;
        ResLoginSessionDto resLoginSessionDto = null;
        try {
            if(null != createLoginPersonDto && null != createLoginPersonDto.getEmailDto() && null != createLoginPersonDto.getDniDto()){
                login = new Login(createLoginPersonDto.getEmailDto(),pbkdf2EncryptSecurity.generateHashPassword(createLoginPersonDto.getPasswordDto())
                        ,new Date(),new Date(),Constant.ACTIVE);
                iLoginRepository.save(login);
                if(null != login){
                    Teacher teacher = new Teacher(createLoginPersonDto.getDniDto(),createLoginPersonDto.getNameDto(),createLoginPersonDto.getLastNameDto(),createLoginPersonDto.getAgeDto(),
                            new Date(), new Date(),Constant.ACTIVE,login);
                    iTeacherRepository.save(teacher);
                    resLoginSessionDto = new ResLoginSessionDto(login.getEmail(),teacher.getIdTeacher(),teacher.getDni(),teacher.getName(),teacher.getLastName(),teacher.getAge());
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
