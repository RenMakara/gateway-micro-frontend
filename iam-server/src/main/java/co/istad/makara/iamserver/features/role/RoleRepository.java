package co.istad.makara.iamserver.features.role;

import co.istad.makara.iamserver.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
