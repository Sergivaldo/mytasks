package junior.sergivaldo.mytasks.adapter.primary.api.mapper.impl;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskDTOMapper;
import junior.sergivaldo.mytasks.application.domain.TaskEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskDTOMapperImpl implements TaskDTOMapper {

    @Override
    public TaskEntity mapToEntity(TaskDTO dto) {
        return TaskEntity.builder()
                .title(dto.getTitle().toLowerCase())
                .taskListId(dto.getTaskListId())
                .description(dto.getDescription())
                .build();
    }

    @Override
    public List<TaskDTO> mapToDTO(List<TaskEntity> entities) {
        return entities
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
                .position(task.getPosition())
                .taskListId(task.getTaskListId())
                .createdAt(task.getCreatedAt())
                .lastUpdatedAt(task.getUpdatedAt())
                .build();
    }

}
