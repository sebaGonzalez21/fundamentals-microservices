package cl.test.proyecto.imp;

import cl.test.proyecto.dto.*;
import cl.test.proyecto.exception.NotSaveException;
import cl.test.proyecto.model.Course;
import cl.test.proyecto.model.CoursePerson;
import cl.test.proyecto.model.Student;
import cl.test.proyecto.model.Teacher;
import cl.test.proyecto.repository.ICoursePersonRepository;
import cl.test.proyecto.repository.ICourseRepository;
import cl.test.proyecto.repository.IStudentRepository;
import cl.test.proyecto.repository.ITeacherRepository;
import cl.test.proyecto.service.ICoursePersonService;
import cl.test.proyecto.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CoursePersonImp implements ICoursePersonService {


    @Autowired
    private ICoursePersonRepository iCoursePersonRepository;

    @Autowired
    private ICourseRepository iCourseRepository;

    @Autowired
    private ITeacherRepository iTeacherRepository;

    @Autowired
    private IStudentRepository iStudentRepository;

    @Override
    public ResCoursePersonDto saveCoursePerson(CoursePersonDto coursePersonDto) throws NotSaveException {
        ResCoursePersonDto resCoursePersonDtoLocal = null;
        try {

            CoursePerson coursePersonLocal = iCoursePersonRepository.findByStudent_IdStudentAndTeacher_IdTeacherAndCourse_IdCourseAndActive(coursePersonDto.getIdStudentDto(),coursePersonDto.getIdTeacherDto(),coursePersonDto.getIdCourseDto(),Constant.ACTIVE);
            Student student = iStudentRepository.findByIdStudent(coursePersonDto.getIdStudentDto());
            Teacher teacher = iTeacherRepository.findByIdTeacher(coursePersonDto.getIdTeacherDto());
            Course course = iCourseRepository.findByIdCourse(coursePersonDto.getIdCourseDto());
            if(null == coursePersonLocal && null != course && null != teacher && null!= student){
                CoursePerson coursePerson = new CoursePerson(student,teacher,course,new Date(),Constant.ACTIVE);
                iCoursePersonRepository.save(coursePerson);
                StudentDto studentDto = new StudentDto(student.getIdStudent(),student.getDni(),student.getName(),student.getLastName()
                                    ,student.getAge(),student.getDateCreation(),student.getDateUpdate(),student.getActive());
                TeacherDto teacherDto = new TeacherDto(teacher.getIdTeacher(),teacher.getDni(),teacher.getName(),teacher.getLastName(),teacher.getAge(),teacher.getDateCreation(),teacher.getDateUpdate(),teacher.getActive());
                Course courseDto = new Course(course.getIdCourse(),course.getName());
                resCoursePersonDtoLocal = new ResCoursePersonDto(coursePerson.getId(), studentDto, teacherDto,coursePerson.getDateCreation(), courseDto, coursePerson.getActive());
            }else{
                throw new NotSaveException(Constant.NOT_SAVE_EXCEPTION);
            }
       }catch (NotSaveException ex){
           throw new NotSaveException(ex.getMessage());
       }
        return resCoursePersonDtoLocal;
    }
}
