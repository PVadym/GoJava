package Module7.Task4;

import java.util.*;

/**
 * Created by Вадим on 24.11.2016.
 */
public class DAOImpl implements DAO {

    List<Room> rooms = new ArrayList<Room>();
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

        rooms.add(new Room(4001,1850,1,date1,"Lux", "Kyiv"));
        rooms.add(new Room(4002,1500,1,date2,"Boom", "Cherkassy"));
        rooms.add(new Room(4003,2100,2,date3,"Gernyi", "Kharkiv"));
        rooms.add(new Room(4004,3250,2,date4,"Homer", "Kyiv"));
        rooms.add(new Room(4005,1750,2,date5,"Privet", "Brovary"));

    }



    @Override
    public List<Room> save(Room room) {
        rooms.add(room);
        return rooms;
    }

    @Override
    public boolean delete(Room room) {
        boolean isDeleted = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).equals(room)) {
                rooms.remove(i);
                isDeleted = true;
            }
        }
        return isDeleted;
    }


    @Override
    public Room update(Room room) {
        for (int i = 0; i < rooms.size(); i++) {
            if (room.getId() == rooms.get(i).getId()) {
                rooms.remove(i);
                rooms.add(0,room);
                return rooms.get(0);}
        }
        return null;
    }

    @Override
    public Room findById(Room room) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getId() == room.getId())
                return rooms.get(i);
        }
        return null;

    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }
}
