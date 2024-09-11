package junior.sergivaldo.mytasks.adapter.primary.api.mapper.impl;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.UserDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.UserDTOMapper;
import junior.sergivaldo.mytasks.application.domain.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapperBuilderImpl implements UserDTOMapper {

    @Override
    public UserDTO toDTO(UserEntity userEntity) {
        return UserDTO.builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .email(userEntity.getEmail())
                .build();
    }

    @Override
    public UserEntity toEntity(UserDTO userDTO) {
        return UserEntity.builder()
                .id(userDTO.getId())
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .password(userDTO.getPassword())
                .build();
    }

}
