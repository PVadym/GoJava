package Module8;

import java.util.List;

/**
 * Created by Вадим on 10.12.2016.
 */
public interface AbstractDAO <T> {

    <T> T save (T t);
    <T> void delete(T t);
    <T> void deleteAll(List<T> list);
    <T> void saveAll(List<T> list);
    <T> List<T> getList();

}
