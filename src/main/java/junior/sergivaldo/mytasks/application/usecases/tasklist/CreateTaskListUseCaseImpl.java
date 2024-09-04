package junior.sergivaldo.mytasks.application.usecases.tasklist;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.application.port.in.tasklist.CreateTaskListUseCase;
import junior.sergivaldo.mytasks.application.port.out.tasklist.CreateTaskListAdapter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateTaskListUseCaseImpl
implements CreateTaskListUseCase {
    private final CreateTaskListAdapter createTaskListAdapter;
    private final ExistsTaskListByNameAdapter existsTaskListByNameAdapter;
    private static final Integer INITIAL_LAST_POSITION_VALUE = 0;

    @Override
    public TaskListEntity execute(TaskListEntity taskList) {
        throwExceptionIfExistsTaskListName(taskList.getName());
        taskList.setLastPosition(INITIAL_LAST_POSITION_VALUE);
        return createTaskListAdapter.create(taskList);
    }

    private void throwExceptionIfExistsTaskListName(String name){
        if (existsTaskListByNameAdapter.exists(name)){
            throw new IllegalArgumentException("O nome '%s' já está sendo usado em outra lista de tarefas".formatted(name));
        }
    }
}
