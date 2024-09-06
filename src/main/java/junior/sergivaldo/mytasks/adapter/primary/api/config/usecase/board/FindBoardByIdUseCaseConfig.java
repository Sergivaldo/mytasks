package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.board;

import junior.sergivaldo.mytasks.application.port.in.board.FindBoardByIdUseCase;
import junior.sergivaldo.mytasks.application.port.out.board.FindBoardByIdAdapter;
import junior.sergivaldo.mytasks.application.usecases.board.FindBoardByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindBoardByIdUseCaseConfig {

    @Bean
    public FindBoardByIdUseCase findBoardByIdUseCase(FindBoardByIdAdapter findBoardByIdAdapter){
        return new FindBoardByIdUseCaseImpl(findBoardByIdAdapter);
    }
}
