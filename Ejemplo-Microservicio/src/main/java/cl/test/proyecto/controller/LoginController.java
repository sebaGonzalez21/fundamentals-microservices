package cl.test.proyecto.controller;

import cl.test.proyecto.dto.LoginSessionDto;
import cl.test.proyecto.exception.UnauthorizedException;
import cl.test.proyecto.imp.LoginImp;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/logins")
public class LoginController {

    @Autowired
    private LoginImp loginImp;

    @RequestMapping(value = "/students",method = RequestMethod.POST)
    public ResponseEntity<Object> sessionStudents(@RequestBody LoginSessionDto loginSessionDto){
        ResponseEntity<Object> rs = null;
        try {

            rs = new ResponseEntity<Object>(loginImp.sessionStudent(loginSessionDto), HttpStatus.OK) ;
        }catch (UnauthorizedException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.UNAUTHORIZED) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(Constant.SYSTEM_ERROR, HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }

    @RequestMapping(value = "/teachers",method = RequestMethod.POST)
    public ResponseEntity<Object> sessionTeachers(@RequestBody LoginSessionDto loginSessionDto){
        ResponseEntity<Object> rs = null;
        try {

            rs = new ResponseEntity<Object>(loginImp.sessionTeacher(loginSessionDto), HttpStatus.OK) ;
        }catch (UnauthorizedException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.UNAUTHORIZED) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(Constant.SYSTEM_ERROR, HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }
}
