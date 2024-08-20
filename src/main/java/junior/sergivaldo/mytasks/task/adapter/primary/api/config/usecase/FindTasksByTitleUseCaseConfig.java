package junior.sergivaldo.mytasks.task.adapter.primary.api.config.usecase;

import junior.sergivaldo.mytasks.task.application.port.in.FindTasksByTitleUseCase;
import junior.sergivaldo.mytasks.task.application.port.out.FindTasksByTitleAdapter;
import junior.sergivaldo.mytasks.task.application.usecases.FindTasksByTitleUseCaseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FindTasksByTitleUseCaseConfig {
    private final FindTasksByTitleAdapter  findTasksByTitleAdapter;

    @Bean
    public FindTasksByTitleUseCase findTasksByTitleUseCase() {
        return new FindTasksByTitleUseCaseImpl(findTasksByTitleAdapter);
    }
}
