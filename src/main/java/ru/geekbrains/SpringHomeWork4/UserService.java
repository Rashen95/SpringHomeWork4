package ru.geekbrains.SpringHomeWork4;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDB userDB;

    public UserService(UserDB userDB) {
        this.userDB = userDB;
    }

    public List<User> getAllUsers() {
        return userDB.getUsers();
    }

    public User getUser(int id) {
        return userDB.getUsers().stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }
}