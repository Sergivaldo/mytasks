package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.tasklist;

import junior.sergivaldo.mytasks.application.port.in.FindAllTaskListUseCase;
import junior.sergivaldo.mytasks.application.usecases.tasklist.FindAllTaskListAdapter;
import junior.sergivaldo.mytasks.application.usecases.tasklist.FindAllTaskListUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllTaskListUseCaseConfig {

    @Bean
    public FindAllTaskListUseCase findAllTaskListUseCase(FindAllTaskListAdapter findAllTaskListAdapter) {
        return new FindAllTaskListUseCaseImpl(findAllTaskListAdapter);

    }
}
