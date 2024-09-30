package junior.sergivaldo.mytasks.adapter.primary.api.security;

import junior.sergivaldo.mytasks.application.service.security.PasswordEncoderUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PasswordEncoderUtilImpl implements PasswordEncoderUtil {

    private PasswordEncoder passwordEncoder;

    @Override
    public String encode(String password) {
        return passwordEncoder.encode(password);
    }

}
