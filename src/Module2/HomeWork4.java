package Module2;

/**
 * Created by Вадим on 03.11.2016.
 */
/*
You need to write method which will fund (пополнение) balance of particular user. Print name + balance after funding

Input

int[] balances = {1200, 250, 2000, 500, 3200};

String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

String ownerName = Oww
double withdrawal = 100;

Output
Oww 600
 */
public class HomeWork4 {
    public static void main(String[] args) {


        System.out.println(fund("Oww", 100));
        System.out.println(fund("Ann", 250));
    }

    static String fund(String ownerName, double withdrawal){
        int []balances = {1200,250,2000,500,3200};
        String[]ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String s="Incorrect name";
        for (int i =0; i<ownerNames.length; i++)
        {
            if (ownerName.equals(ownerNames[i]))
                s=ownerNames[i]+" "+(int) (balances[i]+withdrawal);
        }
        return s;
    }

}
