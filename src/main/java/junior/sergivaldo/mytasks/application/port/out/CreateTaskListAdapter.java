package junior.sergivaldo.mytasks.application.port.out;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;

public interface CreateTaskListAdapter {
    TaskListEntity create(TaskListEntity taskListEntity);
}
