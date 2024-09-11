package junior.sergivaldo.mytasks.adapter.secondary.jpa.adapter.user;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.UserModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.UserRepository;
import junior.sergivaldo.mytasks.application.domain.UserEntity;
import junior.sergivaldo.mytasks.application.port.out.user.SignUpAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SignUpJpaAdapter implements SignUpAdapter {

    private final UserRepository userRepository;

    private final UserModelMapper userModelMapper;

    @Override
    public UserEntity signUp(UserEntity user) {
        return userModelMapper.toEntity(
                userRepository.save(
                        userModelMapper.toModel(
                                user
                        )
                )
        );
    }

}
