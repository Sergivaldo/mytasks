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
    private List<TaskEntity> tasks;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
