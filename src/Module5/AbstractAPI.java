package Module5;

/**
 * Created by Вадим on 23.11.2016.
 */
public abstract class AbstractAPI implements API{

    abstract Room[] getArray();



   @ Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        Room [] findrooms= new Room[getArray().length];

        for(int i=0; i < getArray().length; i++){
            if((getArray()[i].getPrice()<=price)&&(getArray()[i].getPersons()==persons)&&
                    (getArray()[i].getCityName().equals(city)&&getArray()[i].getHotelName().equals(hotel)))
                findrooms[i]=getArray()[i];
        }
        return  findrooms;
    }

    @Override
  abstract public Room[] getAll() ;
}

