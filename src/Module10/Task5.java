package Module10;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Вадим on 03.01.2017.
 */
public class Task5 {

    public  void threeExceptions() throws IOException, SQLException, ReflectiveOperationException {
        long time = System.currentTimeMillis();
        if (time%2==0)throw new SQLException();
        else if (time%3==0) throw new ReflectiveOperationException();
        else throw new IOException();



    }
}
