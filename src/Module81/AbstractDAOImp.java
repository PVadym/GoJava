package Module81;

import java.util.List;

/**
 * Created by Вадим on 12.12.2016.
 */
public class AbstractDAOImp implements AbstractDAO {

    List list;
    @Override
    public Object save(Object o) {
        list.add(o);
        return o;
    }

    @Override
    public void delete(Object o) {
        list.remove(o);

    }

    @Override
    public void deleteAll(List list) {
        this.list.removeAll(list);
    }

    @Override
    public void saveAll(List list) {
        this.list.addAll(list);
    }

    @Override
    public List getList() {
        return this.list;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Object get(long id) {
        return null;
    }
}
