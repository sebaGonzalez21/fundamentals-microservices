package cl.test.proyecto.controller;

import cl.test.proyecto.dto.CoursePersonDto;
import cl.test.proyecto.exception.NotSaveException;
import cl.test.proyecto.imp.CoursePersonImp;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/membershipcourses")
public class CoursePersonController {

    @Autowired
    private CoursePersonImp coursePersonImp;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> saveCoursePerson(@RequestBody CoursePersonDto coursePersonDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(coursePersonImp.saveCoursePerson(coursePersonDto), HttpStatus.OK) ;
        }catch (NotSaveException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(Constant.SYSTEM_ERROR, HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }
}
