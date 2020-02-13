package cl.test.proyecto.imp;

import cl.test.proyecto.dto.CourseDto;
import cl.test.proyecto.exception.NotSaveException;
import cl.test.proyecto.model.Course;
import cl.test.proyecto.repository.ICourseRepository;
import cl.test.proyecto.service.ICourseService;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseImp implements ICourseService {

    @Autowired
    private ICourseRepository courseRepository;

    @Override
    public CourseDto saveCourse(CourseDto courseDto) throws NotSaveException {
        CourseDto courseDtoDtoLocal = null;
        try {
              if(null != courseDto.getNameDto()){
                  Course course = new Course(courseDto.getNameDto());
                  courseRepository.save(course);
                  courseDtoDtoLocal = new CourseDto(course.getIdCourse(),course.getName());
              }else{
                  throw new NotSaveException(Constant.NOT_SAVE_EXCEPTION);
              }

        }catch (NotSaveException ex){
            throw new NotSaveException(ex.getMessage());
        }
        return courseDtoDtoLocal;
    }
}
