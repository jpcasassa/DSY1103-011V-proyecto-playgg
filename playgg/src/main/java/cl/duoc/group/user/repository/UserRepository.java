package cl.duoc.group.user.repository;

import cl.duoc.group.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
