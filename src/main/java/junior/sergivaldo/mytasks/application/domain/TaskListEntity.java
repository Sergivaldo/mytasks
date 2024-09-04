package junior.sergivaldo.mytasks.application.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class TaskListEntity {
    private UUID id;
    private String name;
    private UUID boardId;
    private List<TaskEntity> tasks;
    private Integer lastPosition;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public TaskListEntity update(TaskListEntity taskListEntity) {
        this.name = taskListEntity.getName();
        this.lastPosition = taskListEntity.getLastPosition();

        return this;
    }
}
