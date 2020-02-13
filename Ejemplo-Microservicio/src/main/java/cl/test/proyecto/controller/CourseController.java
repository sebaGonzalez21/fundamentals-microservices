package cl.test.proyecto.controller;

import cl.test.proyecto.dto.CourseDto;
import cl.test.proyecto.exception.NotSaveException;
import cl.test.proyecto.imp.CourseImp;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    @Autowired
    private CourseImp courseImp;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> saveCourse(@RequestBody CourseDto courseDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(courseImp.saveCourse(courseDto), HttpStatus.OK) ;
        }catch (NotSaveException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(Constant.SYSTEM_ERROR, HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }
}
