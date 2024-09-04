package junior.sergivaldo.mytasks.application.usecases.task;

import junior.sergivaldo.mytasks.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.application.port.in.task.CreateTaskUseCase;
import junior.sergivaldo.mytasks.application.port.in.tasklist.FindTaskListByIdUseCase;
import junior.sergivaldo.mytasks.application.port.in.tasklist.UpdateTaskListUseCase;
import junior.sergivaldo.mytasks.application.port.out.task.CreateTaskAdapter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final FindTaskListByIdUseCase findTaskListByIdUseCase;
    private final UpdateTaskListUseCase updateTaskListUseCase;
    private final CreateTaskAdapter createTaskAdapter;

    @Override
    public TaskEntity execute(TaskEntity task) {
        TaskListEntity taskListEntity = findTaskListByIdUseCase.execute(task.getTaskListId());
        Integer nextPosition = taskListEntity.getLastPosition() + 1;
        task.setPosition(nextPosition);
        taskListEntity.setLastPosition(nextPosition);
        TaskEntity createdTask = createTaskAdapter.create(task);
        updateTaskListUseCase.execute(taskListEntity);
        return createdTask;
    }

}
