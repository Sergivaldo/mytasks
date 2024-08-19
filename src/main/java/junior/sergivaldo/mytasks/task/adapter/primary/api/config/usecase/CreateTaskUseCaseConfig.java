package junior.sergivaldo.mytasks.task.adapter.primary.api.config.usecase;

import junior.sergivaldo.mytasks.task.application.port.in.CreateTaskUseCase;
import junior.sergivaldo.mytasks.task.application.port.out.CreateTaskAdapter;
import junior.sergivaldo.mytasks.task.application.usecases.CreateTaskUseCaseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CreateTaskUseCaseConfig {
    private final CreateTaskAdapter createTaskAdapter;

    @Bean
    public CreateTaskUseCase createTaskUseCaseImpl() {
        return new CreateTaskUseCaseImpl(createTaskAdapter);
    }
}
