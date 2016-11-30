package Module6.Task456;

import java.util.Arrays;

/**
 * Created by Вадим on 29.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        User u1 = null;
        User u2 = new User(1001,"Vasya","Pypkin",2500,10);
        User u3 = new User(1002,"Petya","Ivanov",2000,10000);
        User u4 = new User(1000,"Grisha","Ternov",1000,200);
        User u5 = new User(1003,"Kolya","Kovalenko",1500,200);
        User u6 = new User(1000,"Grisha","Ternov",1000,200);
        User u7 = new User(1002,"Petya","Ivanov",2000,10000);


        User [] users1 = {u1,u2,u3,u4,u5,u6,u7};

        System.out.println(Arrays.toString(users1));

        User [] users = UserUtils.deleteEmptyUsers(users1);
        System.out.println(Arrays.toString(users));

        System.out.println(Arrays.toString(UserUtils.usersWithContitionalBalance(users,200)));
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));

        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));







    }
}
