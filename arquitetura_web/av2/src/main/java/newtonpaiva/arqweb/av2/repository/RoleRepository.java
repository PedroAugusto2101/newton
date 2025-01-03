package newtonpaiva.arqweb.av2.repository;

import newtonpaiva.arqweb.av2.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
