package Module7.Task4;

import java.util.List;

/**
 * Created by Вадим on 23.11.2016.
 */
public interface API {



    List<Room> findRooms(int price, int persons, String city, String hotel);

    List<Room> getAll();


}


