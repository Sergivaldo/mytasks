package junior.sergivaldo.mytasks.application.usecases.tasklist;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;

import java.util.List;

public interface FindAllTaskListAdapter {

    List<TaskListEntity> find(Integer page, Integer size);
}
