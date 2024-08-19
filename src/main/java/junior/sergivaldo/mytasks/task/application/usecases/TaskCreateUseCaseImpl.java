package junior.sergivaldo.mytasks.task.application.usecases;

import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.task.application.port.in.TaskCreateUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TaskCreateUseCaseImpl implements TaskCreateUseCase {
    private final TaskCreateAdapter taskCreateAdapter;

    @Override
    public TaskEntity execute(TaskEntity task) {
        return taskCreateAdapter.create(task);
    }
}
