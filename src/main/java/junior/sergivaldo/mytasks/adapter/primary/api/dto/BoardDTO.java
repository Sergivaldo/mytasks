package junior.sergivaldo.mytasks.adapter.primary.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private List<TaskListDTO> taskLists;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String createdAt;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String updatedAt;

}
