package site.metacoding.animalprojectfrontend.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
<<<<<<< HEAD
    @Query(value = "SELECT * FROM user WHERE username=:username AND password=:password", nativeQuery = true)
    User aLogin(@Param("username") String username, @Param("password") String password);
=======
    @Query(value = "SELECT * FROM user WHERE username = :username AND password = :password", nativeQuery = true)
    User mLogin(@Param("username") String username, @Param("password") String password);
>>>>>>> fb00b36902b41162eae1f5fb9b170ac49922f8c4
}
