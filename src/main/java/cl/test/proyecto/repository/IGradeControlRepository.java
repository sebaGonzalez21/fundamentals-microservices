package cl.test.proyecto.repository;

import cl.test.proyecto.model.GradeControl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGradeControlRepository extends JpaRepository<GradeControl,Long> {
}
