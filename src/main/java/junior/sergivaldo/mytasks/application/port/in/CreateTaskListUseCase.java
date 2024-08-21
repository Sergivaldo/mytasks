package junior.sergivaldo.mytasks.application.port.in;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;

public interface CreateTaskListUseCase {

    TaskListEntity execute(TaskListEntity taskList);
}
