package junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper;


import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.TaskListModel;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;

import java.util.List;

public interface TaskListModelMapper {

    TaskListModel mapToModel(TaskListEntity taskListEntity);

    TaskListEntity mapToEntity(TaskListModel taskModel);

    List<TaskListEntity> mapToEntity(List<TaskListModel> taskModelList);
}


