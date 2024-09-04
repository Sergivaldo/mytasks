package junior.sergivaldo.mytasks.adapter.secondary.jpa.adapter.tasklist;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.TaskListRepository;
import junior.sergivaldo.mytasks.application.usecases.tasklist.ExistsTaskListByNameAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExistsTaskListByNameJpaAdapter implements ExistsTaskListByNameAdapter {

    private final TaskListRepository taskListRepository;

    @Override
    public boolean exists(String name) {
        return taskListRepository.existsByName(name);
    }
}
