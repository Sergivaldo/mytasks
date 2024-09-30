package junior.sergivaldo.mytasks.adapter.primary.api.mapper;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.SignInDTO;
import junior.sergivaldo.mytasks.application.domain.UserEntity;

public interface SignInDTOMapper {

    SignInDTO toDTO(UserEntity userEntity);

}
