package junior.sergivaldo.mytasks.application.port.out.user;

import junior.sergivaldo.mytasks.application.domain.UserEntity;

public interface CreateUserAdapter {

    UserEntity create(UserEntity user);

}
