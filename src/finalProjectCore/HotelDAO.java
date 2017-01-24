package finalProjectCore;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Вадим on 23.01.2017.
 */

public class HotelDAO implements DAO<Hotel> {

    private static HotelDAO hotelDAO;
    private List<Hotel> hotelList = new ArrayList<>();
    private File file;


    private HotelDAO() {
        //создаем файл для хранения отелей
        try {
            file = new File("src/finalProjectCore/hotelBase.txt");
            if(file.createNewFile()) System.out.println("Файл базы создан!");
        } catch (IOException e) {
            System.out.println("Не далось создать базу!");
        }
        try {
            Stream<String> streamFromFiles = Files.lines(Paths.get(file.getAbsolutePath()));
            streamFromFiles.forEach(line -> {
                String fields[] = line.split("@");
                if (fields.length != 3) throw new RuntimeException("База отелей повреждена");
                if (hotelList.stream().anyMatch(hotel -> hotel.getId() == Long.parseLong(fields[0]))) throw new RuntimeException("База отелей повреждена");
                hotelList.add(new Hotel(Long.parseLong(fields[0]), fields[1], fields[2]));

            });
            streamFromFiles.close();
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException("База отелей повреждена");
        }

    }

    public static HotelDAO getHotelDAO (){
        if (hotelDAO == null) hotelDAO = new HotelDAO();
        return hotelDAO;
    }


    @Override
    public boolean add(Hotel hotel) {

        if (hotelList.stream().anyMatch(hotelFromBase -> hotelFromBase.getId() == hotel.getId())) return false;
        hotelList.add(hotel);
        writerToFile(file,hotelList);
        return true;
    }

    @Override
    public boolean edit(Hotel hotel) {
        Hotel oldHotel;
        if (!hotelList.contains(hotel)){
            System.out.println("Отель не найден");
            return false; }
        oldHotel = hotelDAO.getBase().stream().filter(hotel1 -> hotel1.getId() == hotel.getId()).findAny().get();
        oldHotel.setCity(hotel.getCity());
        oldHotel.setName(hotel.getName());
        writerToFile(file, hotelList);

//        add(ho);
//        RoomDAO roomDAO = RoomDAO.getRoomDAO();
//        for (int i = 0; i < roomDAO.getRoomList().size(); i++) {
//            if (roomDAO.getRoomList().get(i).getHotel().equals(oldHotel)) {
//                roomDAO.edit(roomDAO.getRoomList().get(i), new Room(roomDAO.getRoomList().get(i).getId(),
//                        roomDAO.getRoomList().get(i).getPrice(), roomDAO.getRoomList().get(i).getPersons(), ho));
//            }
//        }
//        remove(oldHotel);
//
        return true;
    }

    @Override
    public boolean remove(Hotel hotel) {
        if (!hotelList.contains(hotel)){
            System.out.println("Отель не найден");
            return false; }

        RoomDAO roomDAO = RoomDAO.getRoomDAO();
        for (int i = 0; i < roomDAO.getBase().size(); i++) {
            if (roomDAO.getBase().get(i).getHotel().equals(hotel)) {
                roomDAO.remove(roomDAO.getBase().get(i));
            }
        }
        hotelList.remove(hotel);
        writerToFile(file,hotelList);
        return true;
    }



    @Override
    public boolean writerToFile (File file, List<Hotel> list){
        StringBuilder stringBuilder = new StringBuilder();
        list.stream().forEach(hotelFromList -> stringBuilder.append(hotelFromList.getId() + "@"
                + hotelFromList.getName() + "@" + hotelFromList.getCity() + "\n"));

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.append(stringBuilder);
            bufferedWriter.flush();

        } catch (IOException e) {
            System.out.println("Не удалось сохранить данные в базу!");
            return false;
        }
        return true;

    }

    @Override
    public List<Hotel> getBase() {
        return hotelList;
    }


}
