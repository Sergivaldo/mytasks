package junior.sergivaldo.mytasks.adapter.secondary.jpa.repository;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.BoardModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BoardRespository extends JpaRepository<BoardModel, UUID> {
}
