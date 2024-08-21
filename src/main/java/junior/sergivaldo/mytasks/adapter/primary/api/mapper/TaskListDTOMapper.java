package junior.sergivaldo.mytasks.adapter.primary.api.mapper;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskListDTO;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;

public interface TaskListDTOMapper {

    TaskListDTO mapToDTO(TaskListEntity taskListEntity);

    TaskListEntity mapToEntity(TaskListDTO taskListDTO);
}
