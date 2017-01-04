package Module10;

/**
 * Created by Вадим on 03.01.2017.
 */
public class Task1Main {
    public static void main(String[] args) {

        try {
            throw new Exception("Exception catch!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block is calling!");
        }
    }
}
