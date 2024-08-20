package junior.sergivaldo.mytasks.task.application.port.out;

import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;

import java.util.List;

public interface FindTasksByTitleAdapter {
    List<TaskEntity> find(String title);
}
