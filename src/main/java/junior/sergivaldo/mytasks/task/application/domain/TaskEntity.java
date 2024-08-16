package junior.sergivaldo.mytasks.task.application.domain;

import lombok.*;

import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder(toBuilder = true)
public class TaskEntity {
    private UUID id;
    private String title;
    private String description;
    private ZonedDateTime createdAt;
    private ZonedDateTime lastUpdatedAt;
}
