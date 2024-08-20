package junior.sergivaldo.mytasks.tasklist.application.usecases;

import junior.sergivaldo.mytasks.tasklist.application.domain.TaskListEntity;

public interface CreateTaskListAdapter {
    TaskListEntity create(TaskListEntity taskListEntity);
}
