package Module10;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.sql.SQLException;

/**
 * Created by Вадим on 03.01.2017.
 */
public class Task4 {

    public void f() throws SQLException {
        try {
            g();
        } catch (FileNotFoundException e) {
            System.out.println("Exception from method g() catch! - " + e);
            throw  new SQLException();
        }
    }
    public void g() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
