package cl.test.proyecto.repository;

import cl.test.proyecto.model.CoursePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoursePersonRepository extends JpaRepository<CoursePerson,Long> {

    CoursePerson findByStudent_IdStudentAndTeacher_IdTeacherAndCourse_IdCourseAndActive(Long idStudent,Long idTeacher, Long idCourse,byte active);
}
