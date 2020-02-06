package cl.test.proyecto.repository;

import cl.test.proyecto.model.GradeTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGradeTestRepository extends JpaRepository<GradeTest,Long> {
}
