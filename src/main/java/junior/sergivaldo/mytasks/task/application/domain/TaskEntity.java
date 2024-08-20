package junior.sergivaldo.mytasks.task.application.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class TaskEntity {
    private final UUID id;
    private String title;
    private String description;
    private TaskListEntity taskList;
    private final LocalDateTime createdAt;
    private LocalDateTime lastUpdatedAt;
}
