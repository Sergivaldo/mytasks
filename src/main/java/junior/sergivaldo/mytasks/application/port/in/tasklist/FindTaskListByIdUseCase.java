package junior.sergivaldo.mytasks.application.port.in.tasklist;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;

import java.util.UUID;

public interface FindTaskListByIdUseCase {
    TaskListEntity execute(UUID id);
}
