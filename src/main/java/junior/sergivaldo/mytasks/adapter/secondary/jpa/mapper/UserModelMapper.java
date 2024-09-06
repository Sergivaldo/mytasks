package junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.UserModel;
import junior.sergivaldo.mytasks.application.domain.UserEntity;

public interface UserModelMapper {

    UserModel toModel(UserEntity userEntity);

    UserEntity toEntity(UserModel userModel);

}
