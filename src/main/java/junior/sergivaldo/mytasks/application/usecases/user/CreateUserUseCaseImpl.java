package junior.sergivaldo.mytasks.application.usecases.user;

import junior.sergivaldo.mytasks.application.domain.UserEntity;
import junior.sergivaldo.mytasks.application.port.in.user.CreateUserUseCase;
import junior.sergivaldo.mytasks.application.port.out.user.CreateUserAdapter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final CreateUserAdapter createUserAdapter;

    @Override
    public UserEntity execute(UserEntity userEntity) {
        return createUserAdapter.create(userEntity);
    }

}
