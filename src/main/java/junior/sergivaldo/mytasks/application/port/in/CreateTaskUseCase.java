package junior.sergivaldo.mytasks.application.port.in;


import junior.sergivaldo.mytasks.application.domain.TaskEntity;

public interface CreateTaskUseCase {
    TaskEntity execute(TaskEntity task);
}
