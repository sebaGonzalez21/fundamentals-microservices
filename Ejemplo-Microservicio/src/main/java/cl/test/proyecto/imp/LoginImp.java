package cl.test.proyecto.imp;

import cl.test.proyecto.dto.LoginSessionDto;
import cl.test.proyecto.dto.ResLoginSessionDto;
import cl.test.proyecto.exception.UnauthorizedException;
import cl.test.proyecto.model.Login;
import cl.test.proyecto.repository.ILoginRepository;
import cl.test.proyecto.security.Pbkdf2EncryptSecurity;
import cl.test.proyecto.service.ILoginService;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

@Service
public class LoginImp implements ILoginService {

    @Autowired
    private Pbkdf2EncryptSecurity pbkdf2EncryptSecurity;

    @Autowired
    private ILoginRepository loginRepository;

    @Override
    public ResLoginSessionDto sessionStudent(LoginSessionDto loginSessionDto) throws UnauthorizedException {
        ResLoginSessionDto resLoginSessionDto = null;
        try {
              Login login = loginRepository.findByEmail(loginSessionDto.getEmailDto());
              if(null != login){
                  if(pbkdf2EncryptSecurity.validatePassword(loginSessionDto.getPasswordDto(),login.getPassword())){
                      resLoginSessionDto = new ResLoginSessionDto(login.getEmail(),login.getStudent().getIdStudent(),login.getStudent().getDni(),
                              login.getStudent().getName(),login.getStudent().getLastName(),login.getStudent().getAge());
                  }else{
                      throw new UnauthorizedException(Constant.SESSION_ERROR);
                  }
              }else{
                  throw new UnauthorizedException(Constant.SESSION_ERROR);
              }

        }catch (UnauthorizedException ex){
            throw new UnauthorizedException(ex.getMessage());
        }catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return resLoginSessionDto;
    }

    @Override
    public ResLoginSessionDto sessionTeacher(LoginSessionDto loginSessionDto) throws UnauthorizedException {
        ResLoginSessionDto resLoginSessionDto = null;
        try {
            Login login = loginRepository.findByEmail(loginSessionDto.getEmailDto());
            if(null != login){
                if(pbkdf2EncryptSecurity.validatePassword(loginSessionDto.getPasswordDto(),login.getPassword())){
                    resLoginSessionDto = new ResLoginSessionDto(login.getEmail(),login.getTeacher().getIdTeacher(),login.getTeacher().getDni(),
                                           login.getTeacher().getName(),login.getTeacher().getLastName(),login.getTeacher().getAge());
                }else{
                    throw new UnauthorizedException(Constant.SESSION_ERROR);
                }
            }else{
                throw new UnauthorizedException(Constant.SESSION_ERROR);
            }

        }catch (UnauthorizedException ex){
            throw new UnauthorizedException(ex.getMessage());
        }catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return resLoginSessionDto;
    }
}
