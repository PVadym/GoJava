package Module4;

/**
 * Created by Вадим on 16.11.2016.
 */
public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.getBank().getLimitOfWithdrawal()>=(amount+amount * user.getBank().getCommission(amount) / 100)) {
            double balance = user.getBalance() - amount - amount * user.getBank().getCommission(amount) / 100;
            System.out.println("Баланс после снятия = "+balance+" (комиссия "+ user.getBank().getCommission(amount)+" % )");
        }
        else System.out.println("Сумма превышает лимит снятия!");
            }

    @Override
    public void fundUser(User user, int amount) {
        if (amount<user.getBank().getLimitOfFunding()) {
            double balance = user.getBalance() + amount;
            System.out.println("Баланс после пополнения = "+balance);
        }
        else System.out.println("Сумма превышает лимит пополнения!");

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if (fromUser.getBank().currency==toUser.getBank().currency) {
            double balfromU = fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount) / 100;
            double baltoU = toUser.getBalance() + amount;
            System.out.println("Баланс "+fromUser.getName()+" после перевода = "+balfromU);
            System.out.println("Баланс "+toUser.getName()+" после перевода = "+baltoU);
        }
        else System.out.println("Разные валюты!");
    }

    @Override
    public void paySalary(User user) {
        double userSalary = user.getSalary()*user.getMonthsOfEmployment();
        System.out.println("Зарплата "+ user.getName()+ " за " + user.getMonthsOfEmployment()
                + " месяца(ев) составляет = "+userSalary + " " + user.getBank().currency);

    }
}
