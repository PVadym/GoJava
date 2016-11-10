package Module3.HomeWork2;

/**
 * Created by Вадим on 09.11.2016.
 */
public class Adder extends Arithmetic {

    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }

    public boolean check(int a, int b){
        if(a>=b) return true;
        else return false;
    }
}
