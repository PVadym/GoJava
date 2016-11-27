package Module5;

/**
 * Created by Вадим on 24.11.2016.
 */
public class Controller {

    API[] apis;

    DAO dao;


    public Controller() {
        apis = new API[3];
        apis[0] = new BookingComAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new GoogleAPI();
        dao = new DAOImpl();

    }



    Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] reqRooms = new Room[15];
        int n = 0;
        for (int i = 0; i < apis.length; i++) {
            Room[] array = apis[i].findRooms(price, persons, city, hotel);
            System.arraycopy(array, 0, reqRooms, n, array.length);
            n += 5;
        }
        return reqRooms;
    }


    Room[] check(API api1, API api2) {
        Room[] checkRoom = new Room[10];
        int n = 0;
        for (int i = 0; i < api1.getAll().length; i++) {

            for (int j = 0; j < api2.getAll().length; j++) {

                if ((api1.getAll()[i].getCityName().equals(api2.getAll()[j].getCityName())) &&
                        api1.getAll()[i].getPrice() == api2.getAll()[j].getPrice() &&
                        api1.getAll()[i].getPersons() == api2.getAll()[j].getPersons()) {
                    checkRoom[n] = api1.getAll()[i];
                    n++;
                    checkRoom[n] = api2.getAll()[j];
                    n++;
                }
            }
        }
        return checkRoom;
    }
}


