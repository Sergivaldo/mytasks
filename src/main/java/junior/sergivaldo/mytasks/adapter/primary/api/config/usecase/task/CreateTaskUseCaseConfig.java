package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.task;

import junior.sergivaldo.mytasks.application.port.in.CreateTaskUseCase;
import junior.sergivaldo.mytasks.application.port.in.FindTaskListByIdUseCase;
import junior.sergivaldo.mytasks.application.port.out.CreateTaskAdapter;
import junior.sergivaldo.mytasks.application.usecases.task.CreateTaskUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateTaskUseCaseConfig {

    @Bean
    public CreateTaskUseCase createTaskUseCaseImpl(CreateTaskAdapter createTaskAdapter, FindTaskListByIdUseCase findTaskListByIdUseCase) {
        return new CreateTaskUseCaseImpl(findTaskListByIdUseCase, createTaskAdapter);
    }
}
