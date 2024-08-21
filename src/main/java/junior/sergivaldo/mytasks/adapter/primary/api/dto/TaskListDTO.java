package junior.sergivaldo.mytasks.adapter.primary.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskListDTO {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private UUID id;

    private String name;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TaskDTO> tasks;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
