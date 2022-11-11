package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
     UserDao userDao;
@Autowired
   public UserServiceImp(UserDao userDao) {
    this.userDao = userDao;
}
    @Override
    @Transactional
    public void save(User user) {
        this.userDao.save(user);
    }

    @Override
    @Transactional
    public void updateUser(User updateUser) {
        this.userDao.updateUser(updateUser);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
        this.userDao.removeUser(id);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(int id) {
        return this.userDao.getUserById(id);
    }
    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return this.userDao.getAllUsers();
    }
}
