package junior.sergivaldo.mytasks.adapter.secondary.jpa.adapter.task;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.TaskModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.TaskRepository;
import junior.sergivaldo.mytasks.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.application.port.out.task.CreateTaskAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class CreateTaskJpaAdapter implements CreateTaskAdapter {

    private final TaskRepository taskRepository;
    private final TaskModelMapper taskModelMapper;

    @Override
    public TaskEntity create(TaskEntity task) {
        return taskModelMapper.toEntity(
                taskRepository.save(taskModelMapper.toModel(task))
        );
    }
}
