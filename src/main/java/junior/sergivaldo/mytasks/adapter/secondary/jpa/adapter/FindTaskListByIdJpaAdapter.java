package junior.sergivaldo.mytasks.adapter.secondary.jpa.adapter;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.TaskListModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.TaskListRepository;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.application.port.out.FindTaskListByIdAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class FindTaskListByIdJpaAdapter implements FindTaskListByIdAdapter {

    private final TaskListRepository taskListRepository;
    private final TaskListModelMapper taskListModelMapper;

    @Override
    public TaskListEntity find(UUID id) {
        return taskListRepository
                .findById(id)
                .map(taskListModelMapper::mapToEntity)
                .orElse(null);
    }
}
