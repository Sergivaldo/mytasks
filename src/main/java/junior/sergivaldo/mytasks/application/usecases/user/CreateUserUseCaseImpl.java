package junior.sergivaldo.mytasks.application.usecases.user;

import junior.sergivaldo.mytasks.application.domain.UserEntity;
import junior.sergivaldo.mytasks.application.port.in.user.CreateUserUseCase;
import junior.sergivaldo.mytasks.application.port.out.user.CreateUserAdapter;
import junior.sergivaldo.mytasks.application.service.security.PasswordEncoderUtil;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final CreateUserAdapter createUserAdapter;

    private final PasswordEncoderUtil passwordEncoderUtil;

    @Override
    public UserEntity execute(UserEntity userEntity) {
        String encryptedPassword = passwordEncoderUtil.encode(userEntity.getPassword());
        userEntity.setPassword(encryptedPassword);
        return createUserAdapter.signUp(userEntity);
    }

}
