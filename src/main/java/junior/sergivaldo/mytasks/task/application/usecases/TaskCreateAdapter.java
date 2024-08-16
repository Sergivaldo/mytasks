package junior.sergivaldo.mytasks.task.application.usecases;

import org.springframework.scheduling.config.Task;

public interface TaskCreateAdapter {
    Task create(Task task);
}
