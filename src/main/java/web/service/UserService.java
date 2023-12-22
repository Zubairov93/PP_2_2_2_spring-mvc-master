package web.service;

import web.models.User;
import java.sql.SQLException;
import java.util.List;
public interface UserService {
     void saveUser(User user) throws SQLException;
     List<User> listUsers();

    User getById(int id);

    void update(User user);

    void delete(int id);
}

