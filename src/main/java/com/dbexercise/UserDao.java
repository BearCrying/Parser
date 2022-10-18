package com.dbexercise;

import com.dbexercise.domain.Connector;
import com.dbexercise.domain.User;

import java.sql.*;
import java.util.Map;

public class UserDao extends Connector {


    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection conn = getConnection();

        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(id, name, password) values(?,?,?)"
        );
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        int status = ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public User findID(String id) throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();

        PreparedStatement ps = conn.prepareStatement(
                "SELECT id, name, password FROM users WHERE id = ?"
        );
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User(rs.getString("id"),
                rs.getString("name"), rs.getString("password"));
        rs.close();
        ps.close();
        conn.close();
        return user;
    }


}