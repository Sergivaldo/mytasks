package junior.sergivaldo.mytasks.application.port.in.task;

import junior.sergivaldo.mytasks.application.domain.TaskEntity;

import java.util.UUID;

public interface FindTaskByIdUseCase {
    TaskEntity execute(UUID id);
}
