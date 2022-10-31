package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    void save(User user);

    void updateUser(long id, User updateUser);

    void removeUser(long id);
    User getUserById(long id);
}
