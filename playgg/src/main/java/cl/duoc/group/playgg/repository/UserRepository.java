package cl.duoc.group.playgg.repository;

import cl.duoc.group.playgg.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
