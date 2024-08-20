package junior.sergivaldo.mytasks.task.adapter.secondary.jpa.adapter;

import junior.sergivaldo.mytasks.task.adapter.secondary.jpa.mapper.TaskModelMapper;
import junior.sergivaldo.mytasks.task.adapter.secondary.jpa.repository.TaskRepository;
import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.task.application.port.out.CreateTaskAdapter;
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
