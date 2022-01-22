package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
   UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
//создать таблицу
    public void createUsersTable() {
        userDaoJDBC.createUsersTable();
    }
//удалить таблицу
    public void dropUsersTable() {
        userDaoJDBC.dropUsersTable();
    }
//добавить пользователя
    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBC.saveUser(name, lastName, age);
    }
//удалить пользователя по id
    public void removeUserById(long id) {
        userDaoJDBC.removeUserById(id);
    }
//получить всех пользователей
    public List<User> getAllUsers() {
        return userDaoJDBC.getAllUsers();
    }
//отчистить таблицу пользователей
    public void cleanUsersTable() {
        userDaoJDBC.cleanUsersTable();
    }
}
