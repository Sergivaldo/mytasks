package junior.sergivaldo.mytasks.task.application.port.in;

import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;

import java.util.List;

public interface FindTasksByTitleUseCase {

    List<TaskEntity> execute(String title);
}
