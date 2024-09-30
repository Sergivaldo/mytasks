package junior.sergivaldo.mytasks.adapter.primary.api.security.jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.SignInDTOMapper;
import junior.sergivaldo.mytasks.application.port.out.user.FindUserByEmailAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class JWTFilter extends OncePerRequestFilter {

    private final JWTTokenService JWTTokenService;

    private final FindUserByEmailAdapter findUserByEmailAdapter;

    private final SignInDTOMapper signInDTOMapper;

    private static final String TYPE_TOKEN = "Bearer";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = recoverToken(request);
        if (token != null) {
            String email = JWTTokenService.validateToken(token);
            Optional
                    .ofNullable(findUserByEmailAdapter.find(email))
                    .map(signInDTOMapper::toDTO)
                    .ifPresent(user -> {
                        var authentication = new UsernamePasswordAuthenticationToken(user, null, null);
                        SecurityContextHolder.getContext().setAuthentication(authentication);
                    });

        }
        filterChain.doFilter(request, response);
    }

    private String recoverToken(HttpServletRequest request) {

        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith(TYPE_TOKEN.concat(" "))) {
            return null;
        }

        return authHeader.replace(TYPE_TOKEN.concat(" "), "");
    }

}
