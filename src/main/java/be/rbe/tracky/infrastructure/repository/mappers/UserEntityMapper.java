package be.rbe.tracky.infrastructure.repository.mappers;

import be.rbe.tracky.domain.User;
import be.rbe.tracky.domain.contracts.EntityMapper;
import be.rbe.tracky.infrastructure.repository.entities.UserEntity;

public class UserEntityMapper implements EntityMapper<User, UserEntity> {

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
