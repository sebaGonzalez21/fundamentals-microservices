package cl.test.proyecto.controller;

import cl.test.proyecto.dto.CreateLoginPersonDto;
import cl.test.proyecto.dto.SubjectDto;
import cl.test.proyecto.exception.ExistedException;
import cl.test.proyecto.exception.NotSaveException;
import cl.test.proyecto.imp.SubjectImp;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/subjects")
public class SubjectController {

    @Autowired
    private SubjectImp subjectImp;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> saveSubject(@RequestBody SubjectDto subjectDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(subjectImp.saveSubject(subjectDto), HttpStatus.OK) ;
        }catch (ExistedException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE) ;
        }catch (NotSaveException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(Constant.SYSTEM_ERROR, HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }

}
