package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    void save(User user);

    void updateUser(int id, User updateUser);

    void removeUser(int id);
    User getUserById(int id);
}
