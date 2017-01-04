package Module10;

/**
 * Created by Вадим on 03.01.2017.
 */
public class Task2and3 {
    public static void main(String[] args) {

        try {
            throw new Task2Error("My Exception Class");

        } catch (Task2Error task2Error) {
            System.out.println(task2Error.getMessage());
        }
        finally {
            System.out.println("Finally block!");
        }

        // Task 3:
        Task2Error e = null;
        try {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e1){
            System.out.println(e1);
        }
    }
}
