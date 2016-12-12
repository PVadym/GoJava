package Module81;

import java.util.List;

/**
 * Created by Вадим on 10.12.2016.
 */
public interface AbstractDAO <T> {

     T save(T t);
     void delete(T t);
     void deleteAll(List<T> list);
     void saveAll(List<T> list);
     List<T> getList();
     void deleteById(long id);
     T get(long id);
}
