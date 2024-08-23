package junior.sergivaldo.mytasks.application.port.out.tasklist;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;

public interface CreateTaskListAdapter {
    TaskListEntity create(TaskListEntity taskListEntity);
}
