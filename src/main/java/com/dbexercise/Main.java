package com.dbexercise;

import com.dbexercise.domain.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add();
        User user = userDao.findID("1");
        System.out.printf(user.getName());
    }
}
