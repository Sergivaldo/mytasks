package junior.sergivaldo.mytasks.task.application.usecases;

import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;

public interface TaskCreateAdapter {
    TaskEntity create(TaskEntity task);
}
