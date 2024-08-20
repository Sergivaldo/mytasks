package junior.sergivaldo.mytasks.task.adapter.secondary.jpa.mapper;

import junior.sergivaldo.mytasks.task.adapter.secondary.jpa.model.TaskModel;
import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;

import java.util.List;

public interface TaskModelMapper {

    TaskModel toModel(TaskEntity task);

    TaskEntity toEntity(TaskModel taskModel);

    List<TaskEntity> toEntity(List<TaskModel> tasks);
}
