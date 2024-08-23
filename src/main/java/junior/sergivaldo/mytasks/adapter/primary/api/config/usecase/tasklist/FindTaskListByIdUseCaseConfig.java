package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.tasklist;

import junior.sergivaldo.mytasks.application.port.in.tasklist.FindTaskListByIdUseCase;
import junior.sergivaldo.mytasks.application.port.out.tasklist.FindTaskListByIdAdapter;
import junior.sergivaldo.mytasks.application.usecases.tasklist.FindTaskListByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindTaskListByIdUseCaseConfig {

    @Bean
    public FindTaskListByIdUseCase findTaskListByIdUseCase(FindTaskListByIdAdapter findTaskListByIdAdapter) {
        return new FindTaskListByIdUseCaseImpl(findTaskListByIdAdapter);
    }
}
