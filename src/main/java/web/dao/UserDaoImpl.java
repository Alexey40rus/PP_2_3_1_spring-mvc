package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(int id, User updateUser) {
        User user = getUserById(id);
        user.setName(updateUser.getName());
        user.setSurname(updateUser.getSurname());
        user.setSalary(updateUser.getSalary());
        entityManager.merge(user);
    }

    @Override
    public void removeUser(int id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

}

