package OopSem5.personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);

    void updateUser(User user);
    void deleteUser(String id);

//    void deleteUser(User user);
}
