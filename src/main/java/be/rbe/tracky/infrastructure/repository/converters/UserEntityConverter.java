package be.rbe.tracky.infrastructure.repository.converters;

import be.rbe.tracky.domain.User;
import be.rbe.tracky.domain.contracts.EntityConverter;
import be.rbe.tracky.infrastructure.repository.entities.UserEntity;

public class UserEntityConverter implements EntityConverter<User, UserEntity> {

    @Override
    public User toDomain(UserEntity userEntity) {
        //todo
        return null;
    }

    @Override
    public UserEntity toEntity(User user) {
        //todo
        return null;
    }
}
