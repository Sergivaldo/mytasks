package junior.sergivaldo.mytasks.application.port.out.tasklist;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;

import java.util.UUID;

public interface FindTaskListByIdAdapter {

    TaskListEntity find(UUID id);
}
