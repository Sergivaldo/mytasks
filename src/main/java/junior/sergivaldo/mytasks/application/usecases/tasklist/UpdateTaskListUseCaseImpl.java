package junior.sergivaldo.mytasks.application.usecases.tasklist;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.application.port.in.tasklist.FindTaskListByIdUseCase;
import junior.sergivaldo.mytasks.application.port.in.tasklist.UpdateTaskListUseCase;
import junior.sergivaldo.mytasks.application.port.out.tasklist.UpdateTaskListAdapter;
import lombok.RequiredArgsConstructor;

import static junior.sergivaldo.mytasks.commons.ThrowExceptionUtils.throwExceotionIfEmptyOrNull;
import static junior.sergivaldo.mytasks.commons.ThrowExceptionUtils.throwExceptionIfNull;

@RequiredArgsConstructor
public class UpdateTaskListUseCaseImpl implements UpdateTaskListUseCase {

    private final FindTaskListByIdUseCase findTaskListByIdUseCase;
    private final UpdateTaskListAdapter updateTaskListAdapter;

    @Override
    public TaskListEntity execute(TaskListEntity taskListEntity) {
        throwExceptionIfNull(taskListEntity, new IllegalArgumentException("Lista de tarefas não pode ser nulo"));
        throwExceptionIfNull(taskListEntity.getLastPosition(), new IllegalArgumentException("Indice da ultima de tarefa na lista não pode ser nulo"));
        throwExceotionIfEmptyOrNull(taskListEntity.getName(), new IllegalArgumentException("Nome da lista de tarefas não pode ser vazio"));

        TaskListEntity foundTaskList = findTaskListByIdUseCase.execute(taskListEntity.getId());
        return updateTaskListAdapter.update(foundTaskList.update(taskListEntity));
    }

}
