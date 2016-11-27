package Module5;

/**
 * Created by Вадим on 22.11.2016.
 */
public interface DAO {

    Room []save(Room room);
    boolean delete (Room room);
    Room update(Room room);
    Room findById (Room room);

    Room [] getAll();
}
