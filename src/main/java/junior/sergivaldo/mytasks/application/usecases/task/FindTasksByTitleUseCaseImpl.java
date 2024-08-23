package junior.sergivaldo.mytasks.application.usecases.task;

import junior.sergivaldo.mytasks.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.application.port.in.task.FindTasksByTitleUseCase;
import junior.sergivaldo.mytasks.application.port.out.task.FindTasksByTitleAdapter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FindTasksByTitleUseCaseImpl implements FindTasksByTitleUseCase {

    private final FindTasksByTitleAdapter findTasksByTitleAdapter;

    @Override
    public List<TaskEntity> execute(String title) {
        return findTasksByTitleAdapter.find(title);
    }
}
