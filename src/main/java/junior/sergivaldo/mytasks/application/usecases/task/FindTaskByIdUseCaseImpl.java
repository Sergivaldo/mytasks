package junior.sergivaldo.mytasks.application.usecases.task;

import junior.sergivaldo.mytasks.application.domain.TaskEntity;
import junior.sergivaldo.mytasks.application.port.in.FindTaskByIdUseCase;
import junior.sergivaldo.mytasks.application.port.out.FindTaskByIdAdapter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class FindTaskByIdUseCaseImpl implements FindTaskByIdUseCase {

    private final FindTaskByIdAdapter findTaskByIdAdapter;

    @Override
    public TaskEntity execute(UUID id) {
        return Optional
                .ofNullable(findTaskByIdAdapter.find(id))
                .orElseThrow(()-> new RuntimeException("Não foi encontrada nenhuma tarefa"));
    }

}
