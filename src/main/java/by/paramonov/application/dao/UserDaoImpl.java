package by.paramonov.application.dao;

import by.paramonov.application.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.UUID;

public class UserDaoImpl implements UserDao{
    @Override
    public UserEntity save(UserEntity userEntity) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(userEntity);
        return null;
    }

    @Override
    public UserEntity findById(UUID id) {
        return null;
    }

    @Override
    public UserEntity findByFirstName(String firstName) {
        return null;
    }

    @Override
    public UserEntity findBySecondName(String secondName) {
        return null;
    }

    @Override
    public UserEntity findByEmail(String email) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session currentSession = sessionFactory.getCurrentSession();
        UserEntity singleResult = currentSession.createQuery("select UserEntity from UserEntity u where u.email = email", UserEntity.class)
                .getSingleResult();
        return singleResult;
    }
}
