package Module7.Task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Вадим on 23.11.2016.
 */
public abstract class AbstractAPI implements API {

    abstract List<Room> getArray();



   @ Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {

        List<Room> findRooms= new ArrayList<Room>();

        for(int i=0; i < getArray().size(); i++){
            if((getArray().get(i).getPrice()<=price)&&getArray().get(i).getPersons()==persons&&
                    (getArray().get(i).getCityName().equals(city)&&getArray().get(i).getHotelName().equals(hotel)))
                findRooms.add(getArray().get(i));
        }
        return  findRooms;
    }

    @Override
  abstract public List<Room> getAll() ;
}

