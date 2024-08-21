package junior.sergivaldo.mytasks.adapter.primary.api.mapper.impl;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskDTOMapper;
import junior.sergivaldo.mytasks.application.domain.TaskEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskDTOMapperImpl implements TaskDTOMapper {

    @Override
    public TaskEntity mapToEntity(TaskDTO task) {
        return TaskEntity.builder()
                .title(task.getTitle().toLowerCase())
                .description(task.getDescription())
                .build();
    }

    @Override
    public List<TaskDTO> mapToDTO(List<TaskEntity> taskEntities) {
        return taskEntities
                .stream()
                .map(this::mapToDTO)
                .toList();
    }


    @Override
    public TaskDTO mapToDTO(TaskEntity task) {
        return TaskDTO.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .listName(task.getTaskList().getName())
                .createdAt(task.getCreatedAt())
                .lastUpdatedAt(task.getUpdatedAt())
                .build();
    }

}
