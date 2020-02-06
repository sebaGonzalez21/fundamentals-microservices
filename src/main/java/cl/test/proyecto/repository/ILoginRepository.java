package cl.test.proyecto.repository;

import cl.test.proyecto.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginRepository extends JpaRepository<Login,Long> {

    @Query(value = ("SELECT * FROM LOGINS s WHERE s.email = :email and active=1"),nativeQuery = true)
    Login initSession(@Param("email") String email);
}
