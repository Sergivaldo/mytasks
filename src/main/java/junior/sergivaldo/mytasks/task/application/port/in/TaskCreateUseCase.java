package junior.sergivaldo.mytasks.task.application.port.in;

import org.springframework.scheduling.config.Task;

public interface TaskCreateUseCase {
    Task execute(Task task);
}
