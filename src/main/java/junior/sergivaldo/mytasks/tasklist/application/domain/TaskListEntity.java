package junior.sergivaldo.mytasks.tasklist.application.domain;

import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class TaskListEntity {
    private UUID id;
    private String name;
    private List<TaskEntity> tasks;
}
