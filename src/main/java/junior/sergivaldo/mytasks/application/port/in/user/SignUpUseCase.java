package junior.sergivaldo.mytasks.application.port.in.user;

import junior.sergivaldo.mytasks.application.domain.UserEntity;

public interface SignUpUseCase {

    UserEntity execute(UserEntity userEntity);

}
