package junior.sergivaldo.mytasks.task.application.usecases;

import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.task.application.port.in.CreateTaskUseCase;
import junior.sergivaldo.mytasks.task.application.port.out.CreateTaskAdapter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {
    private final CreateTaskAdapter createTaskAdapter;

    @Override
    public TaskEntity execute(TaskEntity task) {
        return createTaskAdapter.create(task);
    }

}
