package Module3.HomeWork2;

/**
 * Created by Вадим on 09.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Arithmetic arth1 = new Arithmetic();
        Adder arth2 = new Adder();

        int a=5, b=7;

        int res=arth1.add(a,b);
        System.out.println(res);

        boolean is = arth2.check(a,b);
        System.out.println(is);
    }
}
