package finalProjectCore;


import finalProjectCore.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hotel {
    private long id;
    private String name;
    private String city;
    private List<Room> rooms = new RoomDAO().getRoomList().stream()
            .filter(room -> room.getHotel().getId()==this.getId()).collect(Collectors.toList());

    public Hotel(long id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean add (Room room){
        rooms.add(room);
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (id != hotel.id) return false;
        if (!name.equals(hotel.name)) return false;
        if (!city.equals(hotel.city)) return false;
        return rooms.equals(hotel.rooms);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + rooms.hashCode();
        return result;
    }


}

