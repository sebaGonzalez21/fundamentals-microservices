package cl.test.proyecto.controller;
import cl.test.proyecto.dto.CreateLoginPersonDto;
import cl.test.proyecto.exception.NotSaveException;
import cl.test.proyecto.imp.StudentImp;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") //anotacion para permitir peticiones desde un framework angular y no ser rechazado por cors
@RestController //incluye controller y response body para retornar un objeto
@RequestMapping("/api/v1/students") //url de los servicios api/v1 y en plural
public class StudentController {

    @Autowired
    private StudentImp studentImp;

    //Leer modelo de madurez
    // https://waltermontes.wordpress.com/2014/02/21/modelo-de-madurez-de-richardson-rest/

    //este servicio recibira un post
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> saveStudent(@RequestBody CreateLoginPersonDto loginPersonDto){
        ResponseEntity<Object> rs = null;
        try {
            //https://developer.mozilla.org/es/docs/Web/HTTP/Status codigos status
            rs = new ResponseEntity<Object>(studentImp.saveStudent(loginPersonDto), HttpStatus.OK) ;
        }catch (NotSaveException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(Constant.SYSTEM_ERROR, HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }


}
