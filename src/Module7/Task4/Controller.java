package Module7.Task4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Вадим on 24.11.2016.
 */
public class Controller {

    List<API> apis;

    DAO dao;


    public Controller() {
        apis = new ArrayList<API>();
        apis.add(new BookingComAPI());
        apis.add(new TripAdvisorAPI());
        apis.add (new GoogleAPI());
        dao = new DAOImpl();

    }



    List<Room> requstRooms(int price, int persons, String city, String hotel) {
        List<Room> reqRooms = new ArrayList<>();

        for (int i = 0; i < apis.size(); i++) {
            List<Room> list = apis.get(i).findRooms(price, persons, city, hotel);
            reqRooms.addAll(list);
        }
        return reqRooms;
    }


    List<Room> check(API api1, API api2) {
        List<Room> checkRoom = new ArrayList<>();

        for (int i = 0; i < api1.getAll().size(); i++) {

            for (int j = 0; j < api2.getAll().size(); j++) {

                if ((api1.getAll().get(i).getCityName().equals(api2.getAll().get(j).getCityName())) &&
                        api1.getAll().get(i).getPrice() == api2.getAll().get(j).getPrice() &&
                        api1.getAll().get(i).getPersons() == api2.getAll().get(j).getPersons()) {
                    checkRoom.add(api1.getAll().get(i));

                    checkRoom.add(api2.getAll().get(j));

                }
            }
        }
        return checkRoom;
    }
}


