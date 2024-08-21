package junior.sergivaldo.mytasks.adapter.secondary.jpa.repository;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.TaskListModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskListRepository extends JpaRepository<TaskListModel, UUID> {
}
