package junior.sergivaldo.mytasks.adapter.primary.api.mapper.impl;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskListDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskListDTOMapper;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskListDTOMapperImpl implements TaskListDTOMapper {

    @Override
    public TaskListDTO mapToDTO(TaskListEntity taskListEntity) {
        return TaskListDTO.builder()
                .id(taskListEntity.getId())
                .name(taskListEntity.getName())
                .createdAt(taskListEntity.getCreatedAt())
                .updatedAt(taskListEntity.getUpdatedAt())
                .build();
    }

    @Override
    public TaskListEntity mapToEntity(TaskListDTO taskListDTO) {
        return TaskListEntity.builder()
                .name(taskListDTO.getName())
                .build();
    }
}
