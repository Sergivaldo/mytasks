package junior.sergivaldo.mytasks.adapter.primary.api.security;

import junior.sergivaldo.mytasks.adapter.primary.api.mapper.SignInDTOMapper;
import junior.sergivaldo.mytasks.application.port.out.user.FindUserByEmailAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {

    private final FindUserByEmailAdapter findUserByEmailAdapter;

    private final SignInDTOMapper signInDTOMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return signInDTOMapper.toDTO(
                findUserByEmailAdapter.find(username)
        );
    }

}
