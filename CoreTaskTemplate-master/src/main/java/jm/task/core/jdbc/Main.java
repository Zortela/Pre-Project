package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Stanislav", "Pan", (byte) 22);
        userDaoJDBC.saveUser("Andrey", "Kovalev", (byte) 23);
        userDaoJDBC.saveUser("Gleb", "Zanozin", (byte) 25);
        userDaoJDBC.saveUser("Oleg", "Kim", (byte) 28);
        System.out.println(userDaoJDBC.getAllUsers());
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();

    }
}
