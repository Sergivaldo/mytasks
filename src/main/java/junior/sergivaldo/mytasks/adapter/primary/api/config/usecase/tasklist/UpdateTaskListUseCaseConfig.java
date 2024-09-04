package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.tasklist;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.TaskListRepository;
import junior.sergivaldo.mytasks.application.port.in.tasklist.FindTaskListByIdUseCase;
import junior.sergivaldo.mytasks.application.port.in.tasklist.UpdateTaskListUseCase;
import junior.sergivaldo.mytasks.application.port.out.tasklist.UpdateTaskListAdapter;
import junior.sergivaldo.mytasks.application.usecases.tasklist.UpdateTaskListUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateTaskListUseCaseConfig {

    @Bean
    public UpdateTaskListUseCase updateTaskListUseCase(FindTaskListByIdUseCase findTaskListByIdUseCase, UpdateTaskListAdapter updateTaskListAdapter) {
        return new UpdateTaskListUseCaseImpl(findTaskListByIdUseCase, updateTaskListAdapter);
    }
}
