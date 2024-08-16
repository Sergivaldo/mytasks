package junior.sergivaldo.mytasks.task.application.usecases;

import junior.sergivaldo.mytasks.task.application.port.in.TaskCreateUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.config.Task;

@RequiredArgsConstructor
public class TaskCreateUseCaseImpl implements TaskCreateUseCase {
    private final TaskCreateAdapter taskCreateAdapter;

    @Override
    public Task execute(Task task) {
        return taskCreateAdapter.create(task);
    }
}
