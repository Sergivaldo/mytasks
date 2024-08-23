package junior.sergivaldo.mytasks.application.domain;

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
    private UUID taskListId;
    private Integer position;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
