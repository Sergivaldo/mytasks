package junior.sergivaldo.mytasks.task.application.port.in;


import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;

public interface TaskCreateUseCase {
    TaskEntity execute(TaskEntity task);
}
