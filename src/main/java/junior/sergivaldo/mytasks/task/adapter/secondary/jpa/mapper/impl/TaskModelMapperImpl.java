package junior.sergivaldo.mytasks.task.adapter.secondary.jpa.mapper.impl;

import junior.sergivaldo.mytasks.task.adapter.secondary.jpa.mapper.TaskModelMapper;
import junior.sergivaldo.mytasks.task.adapter.secondary.jpa.model.TaskModel;
import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskModelMapperImpl implements TaskModelMapper {

    @Override
    public TaskModel toModel(TaskEntity task) {
        return TaskModel.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .createdAt(task.getCreatedAt())
                .lastUpdatedAt(task.getLastUpdatedAt())
                .build();
    }

    @Override
    public TaskEntity toEntity(TaskModel task) {
        return TaskEntity.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .createdAt(task.getCreatedAt())
                .lastUpdatedAt(task.getLastUpdatedAt())
                .build();
    }
}
