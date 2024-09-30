package junior.sergivaldo.mytasks.adapter.primary.api.controller.signin;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.SignInDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.security.jwt.JWTTokenService;
import junior.sergivaldo.mytasks.adapter.primary.api.utils.Routes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(Routes.SIGN_IN)
@RequiredArgsConstructor
public class SignInController {

    private final AuthenticationManager authenticationManager;

    private final JWTTokenService jwtTokenService;

    @PostMapping
    public ResponseEntity<?> signIn(@RequestBody SignInDTO signInDTO) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(
                signInDTO.getUsername(), signInDTO.getPassword()
        );
        var authentication = authenticationManager.authenticate(usernamePassword);
        var token = jwtTokenService.generateToken((SignInDTO) authentication.getPrincipal());
        return ResponseEntity
                .ok()
                .body(Map.entry("token", token));
    }

}
