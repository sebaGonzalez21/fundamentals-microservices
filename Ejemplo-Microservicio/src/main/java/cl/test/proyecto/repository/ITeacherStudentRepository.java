package cl.test.proyecto.repository;

import cl.test.proyecto.model.TeacherStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherStudentRepository extends JpaRepository<TeacherStudent,Long> {
}
