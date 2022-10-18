package com.dbexercise;

import com.dbexercise.dao.UserDao;
import com.dbexercise.domain.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add(new User("4","성공", "1234qwer"));
    }
}
