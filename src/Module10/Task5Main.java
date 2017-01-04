package Module10;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Вадим on 03.01.2017.
 */
public class Task5Main {
    public static void main(String[] args) {

        Task5 task5 = new Task5();

        try {
            task5.threeExceptions();
        } catch (IOException |SQLException |ReflectiveOperationException e) {
            System.out.println("Exception is catching = "+ e);
        }
    }
}
