package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.board;

import junior.sergivaldo.mytasks.application.port.in.board.CreateBoardUseCase;
import junior.sergivaldo.mytasks.application.port.out.board.CreateBoardAdapter;
import junior.sergivaldo.mytasks.application.usecases.board.CreateBoardUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateBoardUseCaseConfig {

    @Bean
    public CreateBoardUseCase createBoardUseCase(CreateBoardAdapter createBoardAdapter) {
        return new CreateBoardUseCaseImpl(createBoardAdapter);
    }

}
