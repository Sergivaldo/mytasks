package junior.sergivaldo.mytasks.adapter.primary.api.config.usecase.user;

import junior.sergivaldo.mytasks.application.port.in.user.CreateUserUseCase;
import junior.sergivaldo.mytasks.application.port.out.user.CreateUserAdapter;
import junior.sergivaldo.mytasks.application.service.security.PasswordEncoderUtil;
import junior.sergivaldo.mytasks.application.usecases.user.CreateUserUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateUseCaseConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(CreateUserAdapter createUserAdapter, PasswordEncoderUtil passwordEncoderUtil) {
        return new CreateUserUseCaseImpl(createUserAdapter, passwordEncoderUtil);
    }

}
