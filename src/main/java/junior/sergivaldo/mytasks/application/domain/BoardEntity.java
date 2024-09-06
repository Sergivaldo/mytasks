package junior.sergivaldo.mytasks.application.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class BoardEntity {
    private final UUID id;
    private String name;
    private String description;
    private List<TaskListEntity> taskLists;
    private final String createdAt;
    private String updatedAt;
}
