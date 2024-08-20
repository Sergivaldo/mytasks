package junior.sergivaldo.mytasks.tasklist.application.ports.in;

import junior.sergivaldo.mytasks.tasklist.application.domain.TaskListEntity;

public interface CreateTaskListUseCase {

    TaskListEntity execute(TaskListEntity taskList);
}
