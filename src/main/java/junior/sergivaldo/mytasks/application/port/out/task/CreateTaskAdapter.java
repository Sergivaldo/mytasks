package junior.sergivaldo.mytasks.application.port.out.task;

import junior.sergivaldo.mytasks.application.domain.TaskEntity;

public interface CreateTaskAdapter {
    TaskEntity create(TaskEntity task);
}
