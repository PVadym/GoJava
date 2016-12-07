package Module7.Task4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Вадим on 23.11.2016.
 */
public class BookingComAPI extends AbstractAPI {

    List<Room> rooms = new ArrayList<Room>();

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

        rooms.add(new Room(1001,2000,2,date1,"Grand", "Kyiv"));
        rooms.add(new Room(1002,1600,1,date2,"Slavutich", "Kyiv"));
        rooms.add(new Room(1003,2200,2,date3,"Yaroslav", "Kharkiv"));
        rooms.add( new Room(1004,4000,3,date4,"New", "Odessa"));
        rooms.add( new Room(1005,1500,1,date5,"Arena", "Donetsk"));
    }

    @Override
    List<Room> getArray() {
        return rooms;
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }

}
