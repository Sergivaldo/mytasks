package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.task;

import junior.sergivaldo.mytasks.application.port.in.task.FindTaskByIdUseCase;
import junior.sergivaldo.mytasks.application.port.out.task.FindTaskByIdAdapter;
import junior.sergivaldo.mytasks.application.usecases.task.FindTaskByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindTaskByIdUseCaseConfig {

    @Bean
    public FindTaskByIdUseCase findTaskByIdUseCase(FindTaskByIdAdapter findTaskByIdAdapter) {
        return new FindTaskByIdUseCaseImpl(findTaskByIdAdapter);
    }
}
