package Module2;

/**
 * Created by Вадим on 03.11.2016.
 */
/*
You need to write method which withdraw money of particular account owner if he/she can. Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case. Commision is 5% for all cases.

Example

Input

int[] balances = {1200, 250, 2000, 500, 3200};
String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

String ownerName = Ann
double withdrawal = 100;

Output
Ann 100 145

Input

int[] balances = {1200, 250, 2000, 500, 3200};
String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

String ownerName = Oww
double withdrawal = 490;

Output
Oww NO
 */
public class HomeWork3 {
    public static void main(String[] args) {


        System.out.println(money("Ann", 100));
        System.out.println(money("Oww", 490));
        System.out.println(money("Vasya", 500));
    }
    static String money(String ownerName, double withdraw)
    {
        int [] balances={1200,250,2000,500,3200};
        String [] ownerNames = {"Jane","Ann","Jack","Oww","Lane"};
        String s = "Incorrect Name";
        double commision=withdraw*0.05;
        double bal;
        for(int i=0; i<ownerNames.length; i++)
        {
            if (ownerName.equals(ownerNames[i])) {
                if (balances[i] > (withdraw + commision)) {
                    bal = balances[i] - withdraw - commision;
                    s = ownerNames[i] +" "+ (int)withdraw + " "+(int)bal;
                } else s = ownerNames[i] + " NO";
            }

        }
        return s;
    }
}
