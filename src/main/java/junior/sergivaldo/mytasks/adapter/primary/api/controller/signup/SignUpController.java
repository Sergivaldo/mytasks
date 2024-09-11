package junior.sergivaldo.mytasks.adapter.primary.api.controller.signup;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.UserDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.UserDTOMapper;
import junior.sergivaldo.mytasks.adapter.primary.api.utils.Routes;
import junior.sergivaldo.mytasks.application.port.in.user.SignUpUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Routes.SIGN_UP)
@RequiredArgsConstructor
public class SignUpController {

    private final SignUpUseCase signUpUseCase;

    private final UserDTOMapper userDTOMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO signUp(@RequestBody UserDTO userDTO) {
        return userDTOMapper.toDTO(
                signUpUseCase.execute(
                        userDTOMapper.toEntity(
                                userDTO
                        )
                )
        );
    }

}
