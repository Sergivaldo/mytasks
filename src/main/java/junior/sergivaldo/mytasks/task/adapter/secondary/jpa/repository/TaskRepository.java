package junior.sergivaldo.mytasks.task.adapter.secondary.jpa.repository;

import junior.sergivaldo.mytasks.task.adapter.secondary.jpa.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findByTitleContaining(String title);
}
