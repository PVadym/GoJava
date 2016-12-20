package Module81;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Вадим on 12.12.2016.
 */
public class UserDAO<T extends User> extends AbstractDAOImp<T> {

    List<T> list = getList();

   public void saveUser(T t) {
        save(t);

    }

    @Override
    public void deleteById(long id) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getId()==id) iterator.remove();
        }
    }

    @Override
    public T get(long id) {
        for (int i = 0; i< list.size(); i++) {
            if(list.get(i).getId()==id){
                return  list.get(i);}
        }
        return null;
    }




}
