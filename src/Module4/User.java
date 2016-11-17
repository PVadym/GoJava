package Module4;

/**
 * Created by Вадим on 15.11.2016.
 */
public class User {
   private long id;
   private String name;
   private double balance;
   private int monthsOfEmployment;
   private String companyName;
   private int salary;
   private Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }
    public String toString(){
        return "ID: "+this.id+", Имя: "+this.name+", Баланс: "+this.balance +", Месяцев работы: "+
                this.monthsOfEmployment+", Компания: "+this.companyName + ", З/п: "+this.salary + " ,Банк: "+ this.bank;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public Bank getBank() {
        return bank;
    }

   
}
