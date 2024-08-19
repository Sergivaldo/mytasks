package junior.sergivaldo.mytasks.task.application.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
public class TaskEntity {
    private final UUID id;
    private String title;
    private String description;
    private final ZonedDateTime createdAt;
    private ZonedDateTime lastUpdatedAt;

    @Builder()
    public TaskEntity(String title, String description) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.createdAt = ZonedDateTime.now();
    }
}
