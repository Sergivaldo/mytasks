package junior.sergivaldo.mytasks.adapter.secondary.jpa.adapter.tasklist;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.TaskListModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.TaskListRepository;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.application.port.out.tasklist.UpdateTaskListAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateTaskListJpaAdapter implements UpdateTaskListAdapter {

    private final TaskListRepository taskListRepository;
    private final TaskListModelMapper taskListModelMapper;

    @Override
    public TaskListEntity update(TaskListEntity taskListEntity) {
        return taskListModelMapper
                .mapToEntity(taskListRepository
                        .save(
                                taskListModelMapper.mapToModel(taskListEntity)
                        )
                );
    }
}

