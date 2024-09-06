package junior.sergivaldo.mytasks.adapter.secondary.jpa.repository;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

}
