package junior.sergivaldo.mytasks.application.port.in.tasklist;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;

import java.util.List;

public interface FindAllTaskListUseCase {

    List<TaskListEntity> execute(Integer page, Integer size);
}
