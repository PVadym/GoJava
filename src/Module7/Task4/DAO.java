package Module7.Task4;

import java.util.List;

/**
 * Created by Вадим on 22.11.2016.
 */
public interface DAO {

    List<Room> save(Room room);
    boolean delete (Room room);
    Room update(Room room);
    Room findById (Room room);

    List<Room> getAll();
}
