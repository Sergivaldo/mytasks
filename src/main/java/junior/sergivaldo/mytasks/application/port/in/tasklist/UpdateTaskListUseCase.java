package junior.sergivaldo.mytasks.application.port.in.tasklist;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;

public interface UpdateTaskListUseCase {

    TaskListEntity execute(TaskListEntity taskListEntity);
}
