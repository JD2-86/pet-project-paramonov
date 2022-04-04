package by.paramonov;

import by.paramonov.dao.UserDao;
import by.paramonov.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserDao userDao;

    public UserDetailsServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity foundUser = userDao.findByFirstName(username);
        if (foundUser == null) {
            throw new UsernameNotFoundException("There no user with " + username);
        }
        return null;
    }


}
