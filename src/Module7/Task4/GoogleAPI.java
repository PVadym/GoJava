package Module7.Task4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Вадим on 24.11.2016.
 */
public class GoogleAPI extends AbstractAPI {

    List<Room> rooms = new ArrayList<Room>();

    public GoogleAPI() {

        Calendar cal = Calendar.getInstance();

        cal.set(2016, Calendar.NOVEMBER, 25);
        Date date1 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER, 27);
        Date date2 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER,30);
        Date date3 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER, 31);
        Date date4 = cal.getTime();

        cal.set(2016, Calendar.NOVEMBER, 26);
        Date date5 = cal.getTime();

        rooms.add(new Room(3001,2000,2,date1,"Nowyi", "Kyiv"));
        rooms.add(new Room(3002,1500,1,date2,"Boom", "Cherkassy"));
        rooms.add(new Room(3003,2100,2,date3,"Gernyi", "Kharkiv"));
        rooms.add(new Room(3004,1500,2,date1,"Grand", "Kyiv"));
        rooms.add(new Room(3005,2000,2,date5,"Privet", "Brovary"));
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
