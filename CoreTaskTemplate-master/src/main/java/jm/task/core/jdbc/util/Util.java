package jm.task.core.jdbc.util;


import java.sql.*;

public class Util {

    private String userName = "root";
    private String password = "root";
    private String connectionURL = "jdbc:mysql://localhost:3306/mydbtest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(connectionURL, userName, password);
            Statement statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

/**
    public Util() {
        try (Connection connection = DriverManager.getConnection(connectionURL, userName, password); // Соединение с БД
             Statement statement = connection.createStatement()) {

            Class.forName("com.mysql.cj.jdbc.Driver");// Создание запросов
            statement.executeUpdate("CREATE TABLE AgentDetail (" + "idNo INT(64) NOT NULL AUTO_INCREMENT," + "initials VARCHAR(2)," + "agentDate DATE," + "agentCount INT(64))");
            statement.execute("INSERT INTO  mydbtest.users (name, age, lastName) VALUES ('Gleb', '21', 'Gleb@bk.ru')"); // Вставка новой записи, но тут без ID
            statement.executeUpdate("UPDATE mydbtest.users SET name = 'Andrey', age = 23 WHERE id = 1"); // Изменение какой-то записи с id = 1. Воз-т int кол-во записей, в которое были внесены изменения
            ResultSet resultSet = statement.executeQuery("SELECT * from users"); // Воз-т лист значений?
            statement.addBatch("INSERT INTO  mydbtest.users (name, age, lastName) VALUES ('Sanya', '25', 'SHS@bk.ru')"); // Созд-ся пакет запросов, которые одним с помощью executeBatch пушатся в БД
            statement.addBatch("INSERT INTO  mydbtest.users (name, age, lastName) VALUES ('Zhenya', '25', 'Zhenya@bk.ru')");
            statement.addBatch("INSERT INTO  mydbtest.users (name, age, lastName) VALUES ('Liza', '25', 'LHS@bk.ru')");
            statement.executeBatch();
            statement.clearBatch(); // Чистит батчи
            statement.isClosed(); // true - если statement закрыт

            System.out.println("Соединение с БД установлено!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    */
}



