package junior.sergivaldo.mytasks.application.usecases.tasklist;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.application.port.in.FindAllTaskListUseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FindAllTaskListUseCaseImpl implements FindAllTaskListUseCase {

    private final FindAllTaskListAdapter findAllTaskListAdapter;

    @Override
    public List<TaskListEntity> execute(Integer page, Integer size) {
        return findAllTaskListAdapter.find(page, size);
    }
}
