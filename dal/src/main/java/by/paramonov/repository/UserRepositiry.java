package by.paramonov.repository;

import by.paramonov.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepositiry extends CrudRepository<UserEntity, UUID> {
}
