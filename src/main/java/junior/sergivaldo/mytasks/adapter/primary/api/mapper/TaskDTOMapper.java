package junior.sergivaldo.mytasks.adapter.primary.api.mapper;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskDTO;
import junior.sergivaldo.mytasks.application.domain.TaskEntity;

import java.util.List;

public interface TaskDTOMapper {
     TaskDTO mapToDTO(TaskEntity task);
     TaskEntity mapToEntity(TaskDTO taskDTO);
     List<TaskDTO> mapToDTO(List<TaskEntity> taskEntities);
}
