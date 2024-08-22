package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.task;

import junior.sergivaldo.mytasks.application.port.in.CreateTaskUseCase;
import junior.sergivaldo.mytasks.application.port.out.CreateTaskAdapter;
import junior.sergivaldo.mytasks.application.usecases.CreateTaskUseCaseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CreateTaskUseCaseConfig {

    @Bean
    public CreateTaskUseCase createTaskUseCaseImpl(CreateTaskAdapter createTaskAdapter) {
        return new CreateTaskUseCaseImpl(createTaskAdapter);
    }
}
