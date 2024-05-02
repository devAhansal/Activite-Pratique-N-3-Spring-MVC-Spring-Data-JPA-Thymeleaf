package ma.fsm.activite3_ahansal_salaheddine__part1.security.repo;
import ma.fsm.activite3_ahansal_salaheddine__part1.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
