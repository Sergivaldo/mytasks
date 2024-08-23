package junior.sergivaldo.mytasks.application.usecases.tasklist;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.application.port.in.tasklist.CreateTaskListUseCase;
import junior.sergivaldo.mytasks.application.port.out.tasklist.CreateTaskListAdapter;
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
