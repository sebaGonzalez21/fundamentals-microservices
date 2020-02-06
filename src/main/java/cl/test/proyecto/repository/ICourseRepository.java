package cl.test.proyecto.repository;

import cl.test.proyecto.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends JpaRepository<Course,Long> {
   Course findByIdCourse(Long id);
   Course findByName(String name);
}
