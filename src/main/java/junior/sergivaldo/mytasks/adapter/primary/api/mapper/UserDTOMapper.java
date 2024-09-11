package junior.sergivaldo.mytasks.adapter.primary.api.mapper;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.UserDTO;
import junior.sergivaldo.mytasks.application.domain.UserEntity;

public interface UserDTOMapper {

    UserDTO toDTO(UserEntity userEntity);

    UserEntity toEntity(UserDTO userDTO);

}
