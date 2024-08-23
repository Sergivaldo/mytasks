package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.task;

import junior.sergivaldo.mytasks.application.port.in.task.FindTasksByTitleUseCase;
import junior.sergivaldo.mytasks.application.port.out.task.FindTasksByTitleAdapter;
import junior.sergivaldo.mytasks.application.usecases.task.FindTasksByTitleUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindTasksByTitleUseCaseConfig {

    @Bean
    public FindTasksByTitleUseCase findTasksByTitleUseCase(FindTasksByTitleAdapter  findTasksByTitleAdapter) {
        return new FindTasksByTitleUseCaseImpl(findTasksByTitleAdapter);
    }
}
