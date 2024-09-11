package junior.sergivaldo.mytasks.application.usecases.user;

import junior.sergivaldo.mytasks.application.domain.UserEntity;
import junior.sergivaldo.mytasks.application.port.in.user.SignUpUseCase;
import junior.sergivaldo.mytasks.application.port.out.user.SignUpAdapter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SignUpUseCaseImpl implements SignUpUseCase {

    private final SignUpAdapter signUpAdapter;

    @Override
    public UserEntity execute(UserEntity userEntity) {
        return signUpAdapter.signUp(userEntity);
    }

}
