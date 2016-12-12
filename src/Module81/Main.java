package Module81;

import Module8.*;
import Module8.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Вадим on 12.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        AbstractDAOImp1<User> userDao = new UserDAO1<>();

        User user1 = new User(1007, "Kolya");
        User user2 = new User(1006, "Jora");

        userDao.save(user1);
        userDao.save(user2);
        System.out.println(userDao.getList());

        List<User> listUsers = new ArrayList<>();
        listUsers.add(new User(1001, "Petro"));
        listUsers.add(new User(1002, "Vasya"));
        listUsers.add(new User(1003, "Natasha"));
        listUsers.add(new User(1004, "Vadym"));
        listUsers.add(new User(1005, "Andrey"));

        userDao.saveAll(listUsers);
        System.out.println(userDao.getList());

        userDao.delete(user2);
        System.out.println(userDao.getList());

        User petya = new User(1001, "Petro");
        User vasya = new User(1002, "Vasya");
        User natasha = new User(1003, "Natasha");
        List<User> listU = new ArrayList<>();
        listU.add(petya);
        listU.add(vasya);
        listU.add(natasha);

        userDao.deleteAll(listU);
        System.out.println(userDao.getList());

        userDao.deleteById(1007);
        System.out.println(userDao.getList());

        System.out.println( (User) userDao.get(1004));

    }
}
