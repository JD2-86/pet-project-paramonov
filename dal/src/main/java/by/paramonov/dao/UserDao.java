package by.paramonov.dao;

import by.paramonov.entity.UserEntity;

import java.util.UUID;

public interface UserDao {
    UserEntity save(UserEntity userEntity);
    UserEntity findById(UUID id);
    UserEntity findByFirstName(String firstName);
    UserEntity findBySecondName(String secondName);
    UserEntity findByEmail(String email);
}
