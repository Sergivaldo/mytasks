package junior.sergivaldo.mytasks.application.port.in.task;


import junior.sergivaldo.mytasks.application.domain.TaskEntity;

public interface CreateTaskUseCase {
    TaskEntity execute(TaskEntity task);
}
