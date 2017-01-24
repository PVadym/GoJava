package finalProjectCore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Вадим on 23.01.2017.
 */
public class HotelDAO implements DAO<Hotel> {

    private static HotelDAO hotelDAO;
    private List<Hotel> hotelList = new ArrayList<>();


    //    public RoomDAO() {
//        // если пустая, то  будет сообщение - "База пуста!"
//        try(BufferedReader br = new BufferedReader(new FileReader("src/finalProjectCore/roomList1.txt"))) {
//            if (br.readLine()==null)System.out.println("База пуста!");
//
//
//            else {
//                Stream<String> streamFromFiles = Files.lines(Paths.get("src/finalProjectCore/roomList1.txt"));
//                streamFromFiles.forEach(line -> {
//                    String fields[] = line.split(" ");
//
//                    if (fields.length != 4) throw new RuntimeException("База Rooms повреждена!");
//                    Hotel hotel1 = new Hotel(1002,"Redison","Kyiv");
//                    roomList.add(new Room(Long.parseLong(fields[0]), Integer.parseInt(fields[1]), Integer.parseInt(fields[2]),
//                           hotel1 ));
//                });}
//        } catch (IOException | NumberFormatException e) {
//            throw new RuntimeException("База Rooms повреждена");
//
//        }


//    }

    public static HotelDAO getHotelDAO() {
        if (hotelDAO == null) hotelDAO = new HotelDAO();
        return hotelDAO;
    }

    @Override
    public boolean add(Hotel hotel) {
        hotelList.add(hotel);

        return false;
    }

    @Override
    public boolean edit(Hotel hotel) {
        hotelList.stream();
        return false;
    }

    @Override
    public boolean remove(Hotel hotel) {
        return false;
    }
}
