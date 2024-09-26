package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "82EsBZEc181";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dbforpp";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }

}
