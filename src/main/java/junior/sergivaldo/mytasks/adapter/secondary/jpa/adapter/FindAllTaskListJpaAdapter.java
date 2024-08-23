package junior.sergivaldo.mytasks.adapter.secondary.jpa.adapter;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.TaskListModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.TaskListRepository;
import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.application.usecases.tasklist.FindAllTaskListAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindAllTaskListJpaAdapter implements FindAllTaskListAdapter {
    private static final Integer DEFAULT_PAGE_SIZE = 5;
    private final TaskListRepository taskListRepository;
    private final TaskListModelMapper taskListModelMapper;

    @Override
    public List<TaskListEntity> find(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, Optional.ofNullable(size).orElse(DEFAULT_PAGE_SIZE));
        return taskListModelMapper
                .mapToEntity(taskListRepository
                        .findAll(pageable)
                        .stream()
                        .toList()
                );
    }
}
