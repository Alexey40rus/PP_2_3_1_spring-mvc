package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
   void save(User user);
   void updateUser(long id, User updateUser);
   void removeUser(long id);
   User getUserById(long id);

   public List<User> getAllUsers();
}


