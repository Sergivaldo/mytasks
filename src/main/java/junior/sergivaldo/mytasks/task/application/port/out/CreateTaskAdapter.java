package junior.sergivaldo.mytasks.task.application.port.out;

import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;

public interface CreateTaskAdapter {
    TaskEntity create(TaskEntity task);
}
