package Module7.Task4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Вадим on 24.11.2016.
 */
public class TripAdvisorAPI extends AbstractAPI {

    List<Room> rooms = new ArrayList<Room>();

    public TripAdvisorAPI() {

        Calendar cal = Calendar.getInstance();

        cal.set(2016, Calendar.NOVEMBER, 25);
        Date date1 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER, 28);
        Date date2 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER,31);
        Date date3 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER, 26);
        Date date4 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER, 29);
        Date date5 = cal.getTime();

        rooms.add(new Room(2001,1580,2,date1,"Grand", "Kyiv"));
        rooms.add(new Room(2002,1850,1,date2,"Rivera", "Chernigiv"));
        rooms.add(new Room(2003,3200,3,date3,"GoHome", "Kyiv"));
        rooms.add(new Room(2004,2000,2,date4,"Swit", "Kyiv"));
        rooms.add(new Room(2005,1600,1,date5,"Bruger", "Lvov"));

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
