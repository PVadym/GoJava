package Module3.HomeWork4;

/**
 * Created by Вадим on 09.11.2016.
 */
public class MainUser {

    public static void main(String[] args) {
        User user1 = new User("Vasya",12000,5,"Goit",8000,"UAH");

        user1.paySalary();
        System.out.println(user1.withdraw(150000));
        user1.companyNameLenght();
        System.out.println(user1.monthIncreaser(2));;

    }
}
