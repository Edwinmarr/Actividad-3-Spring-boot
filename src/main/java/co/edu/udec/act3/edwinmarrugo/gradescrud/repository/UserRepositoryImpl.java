package co.edu.udec.act3.edwinmarrugo.gradescrud.repository;

import co.edu.udec.act3.edwinmarrugo.gradescrud.model.User;
import co.edu.udec.act3.edwinmarrugo.gradescrud.repository.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private final UserDao userDao;

    public UserRepositoryImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
