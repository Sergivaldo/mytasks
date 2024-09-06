package junior.sergivaldo.mytasks.adapter.primary.api.mapper.impl;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskListDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskDTOMapper;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskListDTOMapper;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TaskListDTOMapperBuilderImpl implements TaskListDTOMapper {

    private final TaskDTOMapper taskDTOMapper;

    @Override
    public TaskListDTO mapToDTO(TaskListEntity taskListEntity) {
        return TaskListDTO.builder()
                .id(taskListEntity.getId())
                .name(taskListEntity.getName())
                .boardId(taskListEntity.getBoardId())
                .tasks(taskDTOMapper.mapToDTO(taskListEntity.getTasks()))
                .createdAt(taskListEntity.getCreatedAt())
                .updatedAt(taskListEntity.getUpdatedAt())
                .build();
    }

    @Override
    public TaskListEntity mapToEntity(TaskListDTO taskListDTO) {
        return TaskListEntity.builder()
                .id(taskListDTO.getId())
                .boardId(taskListDTO.getBoardId())
                .name(taskListDTO.getName())
                .build();
    }

    @Override
    public List<TaskListDTO> mapToDTO(List<TaskListEntity> taskListEntities) {
        return taskListEntities
                .stream()
                .map(this::mapToDTO)
                .toList();
    }
}
