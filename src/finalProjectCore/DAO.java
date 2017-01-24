package finalProjectCore;


import java.io.File;
import java.util.List;

public interface DAO <T> {
     boolean add(T t);
     boolean edit(T t);
     boolean remove(T t);
     boolean writerToFile(File file, List<T> list);
     List<T> getBase();


}
