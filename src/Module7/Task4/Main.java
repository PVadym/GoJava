package Module7.Task4;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Вадим on 23.11.2016.
 */
public class Main {

    public static void main(String[] args) {


        Controller controller = new Controller();

        System.out.println("Поиск по базе BookingComAPI: "+  controller.apis.get(0).findRooms(2000, 2, "Kyiv", "Grand"));
        System.out.println("Поиск по базе TripAdvisorAPI: " + controller.apis.get(1).findRooms(2000, 1,"Chernigiv", "Rivera"));
        System.out.println("Поиск по базе GoogleAPI: "+  controller.apis.get(2).findRooms(2000, 2,"Brovary" ,"Privet"));

        System.out.println("Метод requstRooms1: " + controller.requstRooms(2000, 2, "Kyiv", "Grand"));
        System.out.println("Метод requstRooms2: " + controller.requstRooms(1900, 1, "Chernigiv", "Rivera"));
        System.out.println("Метод requstRooms3: " + controller.requstRooms(3000, 2, "Brovary" ,"Privet"));

        API book = controller.apis.get(0);
        API trip = controller.apis.get(1);
        API google = controller.apis.get(2);

        System.out.println(controller.check(book, trip));
        System.out.println(controller.check(google, trip));
        System.out.println(controller.check(book, google));


        System.out.println("All rooms BD: " + controller.dao.getAll());

        Calendar cal = Calendar.getInstance();
        cal.set(2016, Calendar.NOVEMBER, 25);
        Date date1 = cal.getTime();
        Room room1 = new Room(4001,0,0,date1,null, null);
        System.out.println(controller.dao.findById(room1));


        Room rooms = new Room(4001,1500,1,date1,"Nowyi", "Kyiv");
        System.out.println("Добавление номера в БД: "+ controller.dao.save(rooms));

        Room room2 = new Room(4001,1500,3,date1,"Big", "Cherkasy");
        System.out.println(controller.dao.update(room2));

        System.out.println(controller.dao.delete(room2));


    }


}
