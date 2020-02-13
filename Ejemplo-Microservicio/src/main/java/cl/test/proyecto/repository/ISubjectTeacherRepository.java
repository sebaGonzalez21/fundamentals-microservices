package cl.test.proyecto.repository;

import cl.test.proyecto.model.SubjectTeacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectTeacherRepository extends JpaRepository<SubjectTeacher, Long> {
}
