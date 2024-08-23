package junior.sergivaldo.mytasks.adapter.secondary.jpa.adapter;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.TaskModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.TaskRepository;
import junior.sergivaldo.mytasks.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.application.port.out.FindTaskByIdAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class FindTaskByIdJpaAdapter implements FindTaskByIdAdapter {

    private final TaskRepository taskRepository;
    private final TaskModelMapper taskModelMapper;
    @Override
    public TaskEntity find(UUID id) {
        return taskRepository
                .findById(id)
                .map(taskModelMapper::toEntity)
                .orElse(null);
    }
}
