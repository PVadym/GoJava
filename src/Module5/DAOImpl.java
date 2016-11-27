package Module5;

import OFFLine1.Off3.Task4.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Вадим on 24.11.2016.
 */
public class DAOImpl implements DAO {

    Room[] rooms = new Room[5];
    public DAOImpl() {

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

        rooms[0]= new Room(4001,1850,1,date1,"Lux", "Kyiv");
        rooms[1]= new Room(4002,1500,1,date2,"Boom", "Cherkassy");
        rooms[2]= new Room(4003,2100,2,date3,"Gernyi", "Kharkiv");
        rooms[3]= new Room(4004,3250,2,date4,"Homer", "Kyiv");
        rooms[4]= new Room(4005,1750,2,date5,"Privet", "Brovary");

    }



    @Override
    public Room [] save(Room room) {

        Room[] addRooms = Arrays.copyOf(rooms, rooms.length + 1);// new Room[rooms.length+1];
        addRooms[addRooms.length - 1] = room;
        return addRooms;
    }

    @Override
    public boolean delete(Room room) {
        boolean isDeleted = false;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room)) {
                rooms[i] = null;
                isDeleted = true;
            }
        }
        return isDeleted;
    }


    @Override
    public Room update(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (room.getId() == rooms[i].getId()) {
                rooms[i] = room;
                return rooms[i];}
        }
        return null;
    }

    @Override
    public Room findById(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getId() == room.getId())
                return rooms[i];
        }
        return null;

    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
