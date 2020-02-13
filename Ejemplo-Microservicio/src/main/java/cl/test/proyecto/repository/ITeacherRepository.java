package cl.test.proyecto.repository;

import cl.test.proyecto.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher,Long> {
    Teacher findByIdTeacher(Long id);
}
