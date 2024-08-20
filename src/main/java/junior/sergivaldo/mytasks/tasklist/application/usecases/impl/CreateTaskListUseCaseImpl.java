package junior.sergivaldo.mytasks.tasklist.application.usecases.impl;

import junior.sergivaldo.mytasks.tasklist.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.tasklist.application.ports.in.CreateTaskListUseCase;
import junior.sergivaldo.mytasks.tasklist.application.usecases.CreateTaskListAdapter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateTaskListUseCaseImpl
implements CreateTaskListUseCase {

    private final CreateTaskListAdapter createTaskListAdapter;

    @Override
    public TaskListEntity execute(TaskListEntity taskList) {
        return createTaskListAdapter.create(taskList);
    }
}
