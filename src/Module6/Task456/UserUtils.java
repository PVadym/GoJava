package Module6.Task456;

/**
 * Created by Вадим on 29.11.2016.
 */
public class UserUtils {

    public static User [] uniqueUsers (User [] users){

        for (int i = 0; i <users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i] != null) {
                    if (users[i].equals(users[j])) {
                        users[i] = null;
                    }
                }
            }
        }

        return deleteEmptyUsers(users);
    }

    public static User [] usersWithContitionalBalance (User [] users, int balance){
        int count = 0;
        for(User user: users){
            if (balance==user.getBalance()) count++;
        }
        User [] usersBalance = new User[count];
        for (int i =0, j = 0; i < users.length; i++) {
            if (balance==users[i].getBalance())
            {
                usersBalance [j] = users[i];
                j++;
            }
        }

        return  usersBalance;
    }

    public final static User [] paySalaryToUsers (User [] users){
        for(User user: users){
            user.setBalance(user.getBalance()+user.getSalary());
        }
        return  users;
    }

    public final static long[] getUsersId (User [] users){
        long [] usersId = new long[users.length];
        for (int i = 0; i < usersId.length; i++){
            usersId[i] = users[i].getId();

        }

        return  usersId;
    }

    public static User [] deleteEmptyUsers (User [] users){
        int count=0;
        for (User u: users){
            if (u!=null) count ++;
        }
        User [] withoutNull = new User[count];
        for (int i = 0, j =0; i < users.length; i++){
            if (users[i]!=null){
                withoutNull [j] = users[i];
                j++;
            }
        }
        return  withoutNull;
    }
}

