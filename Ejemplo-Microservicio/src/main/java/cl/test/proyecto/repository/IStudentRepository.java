package cl.test.proyecto.repository;

import cl.test.proyecto.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

    Student findByIdStudent(Long id);

    //forma A
    //@Query(("select * from student s where s.name = ?1"))
    //List<Student> findByName(String name);

    //forma B
    List<Student> findByName(String name);

    //Invocar procedimientos
    //@Transactional
    //@Procedure(procedureName = "GET_STUDENT")
    //Student procedureGetStudent(@Param("student_name") String name);
}
