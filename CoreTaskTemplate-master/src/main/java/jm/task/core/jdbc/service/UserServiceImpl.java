package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;




public class UserServiceImpl implements UserService {

    UserDao userService = new UserDaoJDBCImpl();

    public void createUsersTable() throws SQLException {
        userService.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        userService.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userService.saveUser(name, lastName, age);

    }

    public void removeUserById(long id) throws SQLException {
        userService.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return userService.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        userService.cleanUsersTable();
    }
}
