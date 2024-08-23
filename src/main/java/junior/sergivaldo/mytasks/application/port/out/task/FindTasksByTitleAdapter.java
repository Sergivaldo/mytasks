package junior.sergivaldo.mytasks.application.port.out.task;

import junior.sergivaldo.mytasks.application.domain.TaskEntity;

import java.util.List;

public interface FindTasksByTitleAdapter {
    List<TaskEntity> find(String title);
}
