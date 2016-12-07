package Module7;

import java.util.*;

/**
 * Created by Вадим on 04.12.2016.
 */
public class MainTask5 {

    public static void main(String[] args) {

        List<Integer> listInt1 = new ArrayList<>();
        List<Integer> listInt2 = new LinkedList<>();

        System.out.println("Integer 1000: ");
        System.out.println("Добавление - ArrayList: " + getTimeAddInt(listInt1,1000));
        System.out.println("Добавление - LinkedList: " + getTimeAddInt(listInt2, 1000));

        System.out.println("Set - ArrayList: " + getTimeSetInt(listInt1,1000));
        System.out.println("Set - LinkedList: " + getTimeSetInt(listInt2,1000));

        System.out.println("Get - ArrayList: " + getTimeGet(listInt1));
        System.out.println("Get - LinkedList: " + getTimeGet(listInt2));

        System.out.println("Remove - ArrayList: " + getTimeRemoveInt(listInt1));
        System.out.println("Remove - LinkedList: " + getTimeRemoveInt(listInt2));


        List<String> listString1 = new ArrayList<>();
        List<String> listString2 = new LinkedList<>();

        System.out.println("Strings: 1000");
        System.out.println("Добавление - ArrayList: " + getTimeAddStr(listString1,1000));
        System.out.println("Добавление - LinkedList: " + getTimeAddStr(listString2,1000));

        System.out.println("Set - ArrayList: " + getTimeSetStr(listString1,1000));
        System.out.println("Set - LinkedList: " + getTimeSetStr(listString2,1000));

        System.out.println("Get - ArrayList: " + getTimeGet(listString1));
        System.out.println("Get - LinkedList: " + getTimeGet(listString2));

        System.out.println("Remove - ArrayList: " + getTimeRemoveStr(listString1));
        System.out.println("Remove - LinkedList: " + getTimeRemoveStr(listString2));

        List<Integer> listInt3 = new ArrayList<>();
        List<Integer> listInt4 = new LinkedList<>();

        System.out.println("Integer 10000: ");
        System.out.println("Добавление - ArrayList: " + getTimeAddInt(listInt3,10000));
        System.out.println("Добавление - LinkedList: " + getTimeAddInt(listInt4, 10000));

        System.out.println("Set - ArrayList: " + getTimeSetInt(listInt3,10000));
        System.out.println("Set - LinkedList: " + getTimeSetInt(listInt4,10000));

        System.out.println("Get - ArrayList: " + getTimeGet(listInt3));
        System.out.println("Get - LinkedList: " + getTimeGet(listInt4));

        System.out.println("Remove - ArrayList: " + getTimeRemoveInt(listInt3));
        System.out.println("Remove - LinkedList: " + getTimeRemoveInt(listInt4));


        List<String> listString3 = new ArrayList<>();
        List<String> listString4 = new LinkedList<>();

        System.out.println("Strings: 10000");
        System.out.println("Добавление - ArrayList: " + getTimeAddStr(listString3,10000));
        System.out.println("Добавление - LinkedList: " + getTimeAddStr(listString4,10000));

        System.out.println("Set - ArrayList: " + getTimeSetStr(listString3,10000));
        System.out.println("Set - LinkedList: " + getTimeSetStr(listString4,10000));

        System.out.println("Get - ArrayList: " + getTimeGet(listString3));
        System.out.println("Get - LinkedList: " + getTimeGet(listString4));

        System.out.println("Remove - ArrayList: " + getTimeRemoveStr(listString3));
        System.out.println("Remove - LinkedList: " + getTimeRemoveStr(listString4));

            }

    public static void addInt (List <Integer>  list, int n){
        for (int i = 0; i <n; i++){
            list.add(i);
        }

    }
    public static void setInt (List<Integer>  list, int n){
        for (int i = 0; i <n; i++){
            list.set(i, (i+i));
        }
    }

    public static void addStr (List <String>  list, int n){
        for (int i = 0; i <n; i++){
            list.add(i+"");
        }

    }
    public static void setStr (List<String>  list, int n){
        for (int i = 0; i <n; i++){
            list.set(i, (i+""));
        }
    }
    public static void get (List  list){
        for (int i = 0; i <list.size(); i++){
            list.get(i);
        }

    }

    public  static void removeStr (List <String>  list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (!iterator.next().isEmpty())
                iterator.remove();
        }
    }
    public  static void removeInt (List <Integer>  list){
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            if (!iterator.next().equals(null))
                iterator.remove();
        }

    }

    public static long  getTimeAddInt(List list, int n)
    {
        Date begin = new Date();
        addInt(list,n);
        Date end = new Date();

        return (end.getTime() - begin.getTime());
    }
    public static long  getTimeSetInt(List list, int n)
    {
        Date begin = new Date();
        setInt(list, n);
        Date end = new Date();

        return (end.getTime() - begin.getTime());
    }

    public static long  getTimeAddStr(List list, int n)
    {
        Date begin = new Date();
        addStr(list, n);
        Date end = new Date();

        return (end.getTime() - begin.getTime());
    }
    public static long  getTimeSetStr(List list, int n)
    {
        Date begin = new Date();
        setStr(list, n);
        Date end = new Date();

        return (end.getTime() - begin.getTime());
    }
    public static long  getTimeGet(List list)
    {
        Date begin = new Date();
        get(list);
        Date end = new Date();

        return (end.getTime() - begin.getTime());
    }
    public static long  getTimeRemoveStr(List list)
    {
        Date begin = new Date();
        removeStr(list);
        Date end = new Date();

        return (end.getTime() - begin.getTime());
    }
    public static long  getTimeRemoveInt(List list)
    {
        Date begin = new Date();
        removeInt(list);
        Date end = new Date();

        return (end.getTime() - begin.getTime());
    }
}
