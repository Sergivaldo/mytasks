package junior.sergivaldo.mytasks.adapter.secondary.jpa.adapter;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.TaskListModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.TaskListRepository;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.application.port.out.CreateTaskListAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateTaskListJpaAdapter implements CreateTaskListAdapter {

    private final TaskListRepository taskListRepository;
    private final TaskListModelMapper taskListModelMapper;


    @Override
    public TaskListEntity create(TaskListEntity taskListEntity) {
        return taskListModelMapper.mapToEntity(
                taskListRepository.save(
                        taskListModelMapper.mapToModel(taskListEntity)
                )
        );
    }
}
