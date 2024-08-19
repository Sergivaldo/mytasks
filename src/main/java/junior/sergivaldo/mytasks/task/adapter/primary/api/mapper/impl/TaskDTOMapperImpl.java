package junior.sergivaldo.mytasks.task.adapter.primary.api.mapper.impl;

import junior.sergivaldo.mytasks.task.adapter.primary.api.dto.TaskDTO;
import junior.sergivaldo.mytasks.task.adapter.primary.api.mapper.TaskDTOMapper;
import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDTOMapperImpl implements TaskDTOMapper {

    @Override
    public TaskEntity mapToEntity(TaskDTO task) {
        return TaskEntity.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .createdAt(task.getCreatedAt())
                .lastUpdatedAt(task.getLastUpdatedAt())
                .build();
    }


    @Override
    public TaskDTO mapToDTO(TaskEntity task) {
        return TaskDTO.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .createdAt(task.getCreatedAt())
                .lastUpdatedAt(task.getLastUpdatedAt())
                .build();
    }

}
