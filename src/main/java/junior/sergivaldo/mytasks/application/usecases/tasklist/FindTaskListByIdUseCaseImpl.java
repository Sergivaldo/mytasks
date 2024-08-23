package junior.sergivaldo.mytasks.application.usecases.tasklist;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.application.port.in.FindTaskListByIdUseCase;
import junior.sergivaldo.mytasks.application.port.out.FindTaskListByIdAdapter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class FindTaskListByIdUseCaseImpl implements FindTaskListByIdUseCase {

    private final FindTaskListByIdAdapter findTaskListByIdAdapter;

    @Override
    public TaskListEntity execute(UUID id) {

        return Optional
                .ofNullable(findTaskListByIdAdapter.find(id))
                .orElseThrow(()-> new RuntimeException("Lista de tarefas não encontrada"));
    }
}
