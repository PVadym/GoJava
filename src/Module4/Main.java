package Module4;


/**
 * Created by Вадим on 15.11.2016.
 *
 TASK 6

 Сreate Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank and 2 of ChinaBank.
 Run four different operations with erery User’s baalance and print its objects to console.
 */
public class Main {
    public static void main(String[] args) {

        USBank usBank1 = new USBank(11111,"USA", Currency.USD, 150, 3510.50,10,2500000);
        USBank usBank2 = new USBank(11112,"USA", Currency.EU, 100, 1250.50,25,1200000);

        EUBank euBank1 = new EUBank(22222, "France",Currency.USD, 85,2500.20,21,200000);
        EUBank euBank2 = new EUBank(22221, "Ukraine",Currency.EU, 15,800.15,125,50000);

        ChinaBank chinaBank1 = new ChinaBank(33333, "China",Currency.USD, 125,1500.10,145,615000);
        ChinaBank chinaBank2 = new ChinaBank(33332, "India",Currency.EU, 58,505.50,145125,15000);



        User u1= new User(1001,"Vasya" ,10000,5,"Google", 2000, usBank1);
        User u2= new User(1002,"Kolya" ,11000,4,"Yandex", 3000, usBank2);
        User u3= new User(1003,"Petya" ,20100,8,"Goit", 5000, euBank1);
        User u4= new User(1004,"Grisha" ,20000,9,"Zavod im.Lenina", 1000, euBank2);
        User u5= new User(1005,"Tolya" ,15000,6,"Velyka kyshenya", 500, chinaBank1);
        User u6= new User(1006,"Olya" ,6300,1,"Silpo", 2500, chinaBank2);


        BankSystem system = new BankSystemImpl();

        System.out.println(u1);
        system.withdrawOfUser(u1, 100);
        system.fundUser(u1,500);
        system.transferMoney(u1,u3,100);
        system.paySalary(u1);
        System.out.println();

        System.out.println(u2);
        system.withdrawOfUser(u2, 1000);
        system.fundUser(u2,50000);
        system.transferMoney(u2,u4,1000);
        system.paySalary(u2);
        System.out.println();

        System.out.println(u3);
        system.withdrawOfUser(u3, 10000);
        system.fundUser(u3,500);
        system.transferMoney(u3,u5,100);
        system.paySalary(u3);
        System.out.println();

        System.out.println(u4);
        system.withdrawOfUser(u4, 200);
        system.fundUser(u3,5600);
        system.transferMoney(u4,u5,1000);
        system.paySalary(u4);
        System.out.println();

        System.out.println(u5);
        system.withdrawOfUser(u5, 1256);
        system.fundUser(u5,6520);
        system.transferMoney(u5,u1,1250);
        system.paySalary(u5);
        System.out.println();

        System.out.println(u6);
        system.withdrawOfUser(u6, 256);
        system.fundUser(u6,500);
        system.transferMoney(u6,u4,2500);
        system.paySalary(u6);


    }


}
