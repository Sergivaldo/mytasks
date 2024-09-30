package junior.sergivaldo.mytasks.adapter.secondary.jpa.adapter.user;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.UserModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.UserRepository;
import junior.sergivaldo.mytasks.application.domain.UserEntity;
import junior.sergivaldo.mytasks.application.port.out.user.FindUserByEmailAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindUserByEmailJpaAdapter implements FindUserByEmailAdapter {

    private final UserRepository userRepository;

    private final UserModelMapper userModelMapper;

    @Override
    public UserEntity find(String email) {
        return userRepository.findByEmail(email)
                .map(userModelMapper::toEntity)
                .orElse(null);
    }

}
