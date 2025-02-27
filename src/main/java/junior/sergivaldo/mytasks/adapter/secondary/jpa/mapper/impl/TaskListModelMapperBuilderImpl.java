package junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.impl;


import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.TaskListModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.TaskModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.BoardModel;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.TaskListModel;
import junior.sergivaldo.mytasks.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TaskListModelMapperBuilderImpl implements TaskListModelMapper {

    private final TaskModelMapper taskModelMapper;

    @Override
    public TaskListModel mapToModel(TaskListEntity taskListEntity) {
        return TaskListModel.builder()
                .id(taskListEntity.getId())
                .board(BoardModel.builder().id(taskListEntity.getBoardId()).build())
                .name(taskListEntity.getName())
                .lastPosition(taskListEntity.getLastPosition())
                .build();
    }

    @Override
    public TaskListEntity mapToEntity(TaskListModel taskList) {
        List<TaskEntity> tasks = Optional
                .ofNullable(taskList.getTasks())
                .map(
                       taskModels -> taskModels
                               .stream()
                               .map(taskModelMapper::toEntity)
                               .toList()
                )
                .orElse(Collections.emptyList());


        return TaskListEntity.builder()
                .id(taskList.getId())
                .boardId(taskList.getBoard().getId())
                .name(taskList.getName())
                .tasks(tasks)
                .lastPosition(taskList.getLastPosition())
                .createdAt(taskList.getCreatedAt())
                .updatedAt(taskList.getUpdatedAt())
                .build();
    }

    @Override
    public List<TaskListEntity> mapToEntity(List<TaskListModel> taskModelList) {
        return taskModelList
                .stream()
                .map(this::mapToEntity)
                .toList();
    }
}
