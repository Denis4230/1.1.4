package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main  {


    public static void main(String[] args) throws NullPointerException {
        User user = new User("Fil", "s", (byte) 23);
        User user1 = new User("Alex", "d", (byte)53);
        User user2 = new User("Jon", "q", (byte)73);
        User user3 = new User("Jon", "q",  (byte)73);

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();


//        userService.cleanUsersTable();
        userService.saveUser(user.getName(), user.getLastName(), user.getAge());
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());

        System.out.println(userService.getAllUsers());
        userService.removeUserById(7);

        System.out.println(userService.getAllUsers());

        userService.dropUsersTable();

        

    }
}
