package finalProjectCore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Вадим on 22.01.2017.
 */
public class RoomDAO implements DAO<Room> {

    private List<Room> roomList = new ArrayList<>();

    public RoomDAO() {
        // если пустая, то  будет сообщение - "База пуста!"
        try(BufferedReader br = new BufferedReader(new FileReader("src/finalProjectCore/roomList1.txt"))) {
            if (br.readLine()==null)System.out.println("База пуста!");


            else {
                Stream<String> streamFromFiles = Files.lines(Paths.get("src/finalProjectCore/roomList1.txt"));
                streamFromFiles.forEach(line -> {
                    String fields[] = line.split(" ");

                    if (fields.length != 4) throw new RuntimeException("База Rooms повреждена!");
                    Hotel hotel1 = new Hotel(1002,"Redison","Kyiv");
                    roomList.add(new Room(Long.parseLong(fields[0]), Integer.parseInt(fields[1]), Integer.parseInt(fields[2]),
                           hotel1 ));
                });}
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException("База Rooms повреждена");

        }


    }
    @Override
    public boolean add(Room room) {
        Hotel hotel = room.getHotel();
        hotel.getRooms().add(room);
        return true;
    }

    @Override
    public boolean edit(Room room) {
       Room r=  room.getHotel().getRooms().stream()
                .filter(room1 -> room1.getId()==room.getId())
                .findAny()
                .get();
        r.getHotel().getRooms().remove(r);
        room.getHotel().getRooms().add(room);

        return false;
    }

    @Override
    public boolean remove(Room room) {
        //Hotel hotel = room.getHotel();
        room.getHotel().getRooms().remove(room);
        return false;
    }


    @Override
    public String toString() {
        return "RoomDAO{" +
                "roomList=" + roomList +
                '}';
    }

    public List<Room> getRoomList() {
        return roomList;
    }
}
