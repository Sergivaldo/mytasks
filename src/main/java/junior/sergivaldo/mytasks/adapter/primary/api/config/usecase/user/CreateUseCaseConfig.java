package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.user;

import junior.sergivaldo.mytasks.application.port.in.user.SignUpUseCase;
import junior.sergivaldo.mytasks.application.port.out.user.SignUpAdapter;
import junior.sergivaldo.mytasks.application.usecases.user.SignUpUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateUseCaseConfig {

    @Bean
    public SignUpUseCase createUserUseCase(SignUpAdapter signUpAdapter) {
        return new SignUpUseCaseImpl(signUpAdapter);
    }

}
