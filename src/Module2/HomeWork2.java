package Module2;

/**
 * Created by Вадим on 03.11.2016.
 */
/*
Continue with BANK example
2.1 Write method which withdraws money from account and takes commision 5% of the transaction. Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.

Example

Input

balance = 100
withdrawal = 10

Output
OK 0.5 89.5

Input

balance = 100
withdrawal = 99

Output
NO
 */
public class HomeWork2 {
    public static void main(String[] args) {


        System.out.println(trans(100, 10));
        System.out.println(trans(100, 99));

           }
    static String trans(double balance, double withdrawal)
    {
        String s;
        double commision =0.05*withdrawal;
        if (balance>(withdrawal+commision))
        {   balance=balance-withdrawal-commision;
            s=("OK" +" "+commision+" "+balance );
        }
        else s="NO";


        return s;
    }
}
