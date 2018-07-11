package ru.avlasov.crisscrossserver.Auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.avlasov.crisscrossserver.Auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(String login);
}
