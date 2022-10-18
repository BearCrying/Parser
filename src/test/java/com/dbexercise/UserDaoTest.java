package com.dbexercise;

import com.dbexercise.dao.UserDao;
import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoTest {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = new User("8", "EternityHwan", "1234");
        userDao.add(user);

        User selectedUser = userDao.findID("8");
        Assertions.assertEquals("EternityHwan", selectedUser.getName());
    }

}