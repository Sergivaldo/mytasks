package junior.sergivaldo.mytasks.adapter.primary.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private UUID id;

    private String name;

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private List<TaskListEntity> taskLists;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String createAt;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String updatedAt;

}
