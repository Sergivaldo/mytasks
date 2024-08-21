package junior.sergivaldo.mytasks.application.usecases;

import junior.sergivaldo.mytasks.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.application.port.in.CreateTaskUseCase;
import junior.sergivaldo.mytasks.application.port.out.CreateTaskAdapter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {
    private final CreateTaskAdapter createTaskAdapter;

    @Override
    public TaskEntity execute(TaskEntity task) {
        return createTaskAdapter.create(task);
    }

}
