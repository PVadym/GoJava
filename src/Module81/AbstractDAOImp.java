package Module81;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Вадим on 12.12.2016.
 */
public abstract class AbstractDAOImp<T> implements AbstractDAO<T> {

    List<T> list;

    public AbstractDAOImp(){
        list = new ArrayList<T>();
    }

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);

    }

    @Override
    public void deleteAll(List<T> list) {
        this.list.removeAll(list);
    }

    @Override
    public void saveAll(List<T> list) {
        this.list.addAll(list);
    }

    @Override
    public List<T> getList() {
        return this.list;
    }

    @Override
    public abstract  void deleteById(long id);

    @Override
    public abstract T get(long id);
}
