package junior.sergivaldo.mytasks.task.application.usecases;

import junior.sergivaldo.mytasks.task.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.task.application.port.in.FindTasksByTitleUseCase;
import junior.sergivaldo.mytasks.task.application.port.out.FindTasksByTitleAdapter;
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
