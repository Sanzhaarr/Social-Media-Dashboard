package social.mainbackend.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import social.mainbackend.entities.User;

@Repository
interface UserRepository extends JpaRepository<User, Long> {
}
