package Module81;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Вадим on 12.12.2016.
 */
public class UserDAO extends AbstractDAOImp {

    List<User> list = getList();

    @Override
    public void deleteById(long id) {
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getId()==id) iterator.remove();
        }
    }

    @Override
    public User get(long id) {
        for (int i = 0; i< list.size(); i++) {
            if(list.get(i).getId()==id){
                return  list.get(i);}
        }
        return null;
    }




}
