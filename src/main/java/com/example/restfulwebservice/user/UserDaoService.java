package com.example.restfulwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoService { // 비즈니스 로직과 관련된 부분은 Service class 에 추가함
    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new User(1, "jinsoo1", new Date()));
        users.add(new User(2, "jinsoo2", new Date()));
        users.add(new User(3, "jinsoo3", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}