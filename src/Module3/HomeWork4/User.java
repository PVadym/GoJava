package Module3.HomeWork4;

/**
 * Created by Вадим on 09.11.2016.
 * ЗАДАНИЕ 4

 Create User class with the following fields: String name, int balance, int monthsOfEmployment,
 String companyName, int salary, String currency.

 Create getters and setters and constructor with all fileds.

 Write methods:

 void paySalary() -  that add salary to the balance of the user
 withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
 companyNameLenght - calculates name of the company name
 monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
 */
public class User {

    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, double balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary(){
        balance=salary+balance;
        System.out.println(balance);
    }

    public double withdraw(int summ){
        if(summ<1000){
            if (balance<=(summ+0.05*summ)) return 0;
            else  balance=  balance - summ-0.05*summ;}
        else    if (balance<=(summ+0.1*summ)) return 0;
            else  balance= balance - summ-0.1*summ;

        return balance;
    }

    public void companyNameLenght(){
        System.out.println("companyNameLenght: "+companyName.length());
    }

    public int monthIncreaser(int addMonth){
        return monthsOfEmployment+addMonth;
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

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
