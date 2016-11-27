package Module5;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Вадим on 23.11.2016.
 */
public class BookingComAPI extends AbstractAPI {

    Room [] rooms = new Room[5];

    public BookingComAPI() {

        Calendar cal = Calendar.getInstance();

        cal.set(2016, Calendar.NOVEMBER, 30);
        Date date1 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER, 29);
        Date date2 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER,25);
        Date date3 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER, 28);
        Date date4 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER, 27);
        Date date5 = cal.getTime();

        rooms[0]= new Room(1001,2000,2,date1,"Grand", "Kyiv");
        rooms[1]= new Room(1002,1600,1,date2,"Slavutich", "Kyiv");
        rooms[2]= new Room(1003,2200,2,date3,"Yaroslav", "Kharkiv");
        rooms[3]= new Room(1004,4000,3,date4,"New", "Odessa");
        rooms[4]= new Room(1005,1500,1,date5,"Arena", "Donetsk");
    }

    @Override
    Room[] getArray() {
        return rooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }

}
