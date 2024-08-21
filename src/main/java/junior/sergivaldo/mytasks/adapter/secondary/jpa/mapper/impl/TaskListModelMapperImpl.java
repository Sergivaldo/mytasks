package junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.impl;


import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.TaskListModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.TaskModelMapper;
import junior.sergivaldo.mytasks.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.TaskListModel;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TaskListModelMapperImpl implements TaskListModelMapper {

    private final TaskModelMapper taskModelMapper;

    @Override
    public TaskListModel mapToModel(TaskListEntity taskListEntity) {
        return TaskListModel.builder()
                .name(taskListEntity.getName())
                .build();
    }

    @Override
    public TaskListEntity mapToEntity(TaskListModel taskList) {
        List<TaskEntity> tasks = taskList
                .getTasks()
                .stream()
                .map(taskModelMapper::toEntity)
                .toList();

        return TaskListEntity.builder()
                .id(taskList.getId())
                .name(taskList.getName())
                .tasks(tasks)
                .createdAt(taskList.getCreatedAt())
                .updatedAt(taskList.getUpdatedAt())
                .build();
    }
}
