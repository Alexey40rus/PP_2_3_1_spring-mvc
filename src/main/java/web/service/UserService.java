package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
   void save(User user);

   void updateUser(User updateUser);

   void removeUser(int id);

   User getUserById(int id);

   public List<User> getAllUsers();
}


