package junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper;


import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.TaskListModel;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;

public interface TaskListModelMapper {

    TaskListModel mapToModel(TaskListEntity taskListEntity);

    TaskListEntity mapToEntity(TaskListModel taskModel);
}


