package ru.avlasov.crisscrossserver.Auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.avlasov.crisscrossserver.Auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
