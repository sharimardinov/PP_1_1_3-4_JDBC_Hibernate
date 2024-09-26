package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Иван", "Иванов", (byte) 21);
        System.out.println("User с именем — Иван добавлен в базу данных");
        userService.saveUser("Павел", "Павлов", (byte) 22);
        System.out.println("User с именем — Павел добавлен в базу данных");
        userService.saveUser("Сергей", "Сергеев", (byte) 23);
        System.out.println("User с именем — Сергей добавлен в базу данных");
        userService.saveUser("Мария", "Мариева", (byte) 24);
        System.out.println("User с именем — Мария добавлен в базу данных");

        List<User> users = userService.getAllUsers();
        System.out.println(users.toString());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
