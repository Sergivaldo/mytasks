package junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.impl;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.TaskModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.TaskListModel;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.TaskModel;
import junior.sergivaldo.mytasks.application.domain.TaskEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
public class TaskModelMapperBuilderImpl implements TaskModelMapper {

    @Override
    public TaskModel toModel(TaskEntity task) {
        TaskListModel taskListModel = new TaskListModel();
        taskListModel.setId(task.getTaskListId());

        return TaskModel.builder()
                .id(task.getId())
                .title(task.getTitle())
                .taskList(taskListModel)
                .position(task.getPosition())
                .description(task.getDescription())
                .createdAt(task.getCreatedAt())
                .updatedAt(task.getUpdatedAt())
                .build();
    }

    @Override
    public TaskEntity toEntity(TaskModel task) {
        return TaskEntity.builder()
                .id(task.getId())
                .title(task.getTitle())
                .taskListId(task.getTaskList().getId())
                .position(task.getPosition())
                .description(task.getDescription())
                .createdAt(task.getCreatedAt())
                .updatedAt(task.getUpdatedAt())
                .build();
    }

    @Override
    public List<TaskEntity> toEntity(List<TaskModel> tasks) {
        return tasks
                .stream()
                .map(this::toEntity)
                .toList();
    }
}
