package junior.sergivaldo.mytasks.adapter.primary.api.mapper.impl;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.SignInDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.SignInDTOMapper;
import junior.sergivaldo.mytasks.application.domain.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class SignInDTOMapperBuilderImpl implements SignInDTOMapper {

    @Override
    public SignInDTO toDTO(UserEntity userEntity) {
        return SignInDTO.builder()
                .email(userEntity.getEmail())
                .password(userEntity.getPassword())
                .build();
    }

}
