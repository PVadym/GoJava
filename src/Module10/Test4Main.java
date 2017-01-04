package Module10;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * Created by Вадим on 03.01.2017.
 */
public class Test4Main {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        Task4 task4 = new Task4();

        try {
            task4.f();

        } catch (SQLException e) {
            System.out.println(e);
        }

        try {
            task4.g();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        task4.f();
        task4.g();

    }
}
