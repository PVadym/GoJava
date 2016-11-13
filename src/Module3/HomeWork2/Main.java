package Module3.HomeWork2;

/**
 * Created by Вадим on 09.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Arithmetic arth = new Arithmetic();
        Adder adder = new Adder();

        int a=5, b=7;

        int res=adder.add(a,b);
        System.out.println(res);

        boolean is = adder.check(a,b);
        System.out.println(is);
    }
}
