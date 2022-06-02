package web.service;

import web.model.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {

    void addUser(User user);

    void updateUser(@Valid User user);

    void removeUser(int id);

    User getUserById(int id);

    List<User> listUsers();

}
