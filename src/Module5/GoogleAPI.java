package Module5;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Вадим on 24.11.2016.
 */
public class GoogleAPI extends AbstractAPI {

    Room [] rooms = new Room[5];

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

        rooms[0]= new Room(3001,2000,2,date1,"Nowyi", "Kyiv");
        rooms[1]= new Room(3002,1500,1,date2,"Boom", "Cherkassy");
        rooms[2]= new Room(3003,2100,2,date3,"Gernyi", "Kharkiv");
        rooms[3]= new Room(3004,1500,2,date1,"Grand", "Kyiv");
        rooms[4]= new Room(3005,2000,2,date5,"Privet", "Brovary");
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
