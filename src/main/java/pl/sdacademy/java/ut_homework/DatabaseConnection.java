package pl.sdacademy.java.ut_homework;

import java.util.List;

public interface DatabaseConnection {

    User getUserById(Long id);
    List<User> getUsersByName(String name);
    void save(User userToBeSaved);
}
