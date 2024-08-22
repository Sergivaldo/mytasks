package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.task;

import junior.sergivaldo.mytasks.application.port.in.FindTasksByTitleUseCase;
import junior.sergivaldo.mytasks.application.port.out.FindTasksByTitleAdapter;
import junior.sergivaldo.mytasks.application.usecases.FindTasksByTitleUseCaseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FindTasksByTitleUseCaseConfig {

    @Bean
    public FindTasksByTitleUseCase findTasksByTitleUseCase(FindTasksByTitleAdapter  findTasksByTitleAdapter) {
        return new FindTasksByTitleUseCaseImpl(findTasksByTitleAdapter);
    }
}
