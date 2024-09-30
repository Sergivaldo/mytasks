package junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.impl;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.UserModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.UserModel;
import junior.sergivaldo.mytasks.application.domain.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserModelMapperBuilderImpl implements UserModelMapper {

    @Override
    public UserModel toModel(UserEntity userEntity) {
        return UserModel.builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .password(userEntity.getPassword())
                .email(userEntity.getEmail())
                .build();
    }

    @Override
    public UserEntity toEntity(UserModel userModel) {
        return UserEntity.builder()
                .id(userModel.getId())
                .name(userModel.getName())
                .email(userModel.getEmail())
                .password(userModel.getPassword())
                .build();
    }

}
