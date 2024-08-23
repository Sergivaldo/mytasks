package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.tasklist;

import junior.sergivaldo.mytasks.application.port.in.tasklist.CreateTaskListUseCase;
import junior.sergivaldo.mytasks.application.port.out.tasklist.CreateTaskListAdapter;
import junior.sergivaldo.mytasks.application.usecases.tasklist.CreateTaskListUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateTaskListUseCaseConfig {
    @Bean
    public CreateTaskListUseCase createTaskListUseCase(CreateTaskListAdapter createTaskListAdapter) {
        return new CreateTaskListUseCaseImpl(createTaskListAdapter);
    }
}
