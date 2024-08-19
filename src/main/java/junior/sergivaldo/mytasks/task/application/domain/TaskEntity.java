package junior.sergivaldo.mytasks.task.application.domain;

import lombok.*;

import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

@Getter
public class TaskEntity {
    private final UUID id;
    private String title;
    @Setter
    private String description;
    private final ZonedDateTime createdAt;
    @Setter
    private ZonedDateTime lastUpdatedAt;

    @Builder()
    public TaskEntity(String title, String description) {
        this.id = UUID.randomUUID();
        this.description = description;
        this.createdAt = ZonedDateTime.now();
        setTitle(title);
    }

    public void setTitle(String title) {
        this.title = Objects.requireNonNull(title);
    }

}
