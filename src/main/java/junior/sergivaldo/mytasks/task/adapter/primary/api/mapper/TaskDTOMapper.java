package junior.sergivaldo.mytasks.task.adapter.primary.api.mapper;

import junior.sergivaldo.mytasks.task.adapter.primary.api.dto.TaskDTO;
import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;

public interface TaskDTOMapper {
     TaskDTO mapToDTO(TaskEntity task);
     TaskEntity mapToEntity(TaskDTO taskDTO);
}
