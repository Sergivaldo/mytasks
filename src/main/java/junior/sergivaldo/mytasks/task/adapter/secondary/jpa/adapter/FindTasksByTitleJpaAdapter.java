package junior.sergivaldo.mytasks.task.adapter.secondary.jpa.adapter;

import junior.sergivaldo.mytasks.task.adapter.secondary.jpa.mapper.TaskModelMapper;
import junior.sergivaldo.mytasks.task.adapter.secondary.jpa.repository.TaskRepository;
import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.task.application.port.out.FindTasksByTitleAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class FindTasksByTitleJpaAdapter implements FindTasksByTitleAdapter {

    private final TaskRepository taskRepository;
    private final TaskModelMapper taskModelMapper;

    @Override
    public List<TaskEntity> find(String title) {
        return taskModelMapper.toEntity(
                        taskRepository.findByTitleContaining(title)
                );
    }
}
