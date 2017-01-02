package Module9plus;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by Вадим on 01.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        User u1 = new User(1001, "Vasya", "Petrov", "Lviv", 2000);
        User u2 = new User(1002, "Kolya", "Pupkin", "Lviv", 3000);
        User u3 = new User(1003, "Petya", "Grishun", "Odessa", 5000);
        User u4 = new User(1004, "Grisha", "Pylypenko", "Zaporizzya", 1000);
        User u5 = new User(1005, "Tolya", "Mashkin", "Brovary", 500);
        User u6 = new User(1006, "Olya", "Ivanova", "Kyiv", 2500);
        User u7 = new User(1007, "Yulya", "Novikova", "Vinnytsya", 5000);
        User u8 = new User(1008, "Masha", "Kovakenko", "Pryluky", 1000);
        User u9 = new User(1009, "Vadim", "Tyschenko", "Kyiv", 500);
        User u10 = new User(1010, "Maksim", "Boiko", "Dnipro", 2500);

        Order order1 = new Order(101, 10000, Currency.USD, "A", "2", u1);
        Order order2 = new Order(102, 50, Currency.UAH, "B", "1", u2);
        Order order3 = new Order(103, 100, Currency.USD, "A", "2", u3);
        Order order4 = new Order(104, 10, Currency.UAH, "D", "4", u4);
        Order order5 = new Order(105, 10000, Currency.USD, "E", "5", u5);
        Order order6 = new Order(106, 120, Currency.USD, "F", "6", u6);
        Order order7 = new Order(107, 100, Currency.UAH, "G", "7", u7);
        Order order8 = new Order(108, 115, Currency.UAH, "H", "8", u8);
        Order order9 = new Order(109, 15, Currency.USD, "J", "10", u9);
        Order order10 = new Order(110, 125, Currency.UAH, "J", "10", u10);

        List<Order> list = new ArrayList<Order>();

        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        list.add(order5);
        list.add(order6);
        list.add(order7);
        list.add(order2);
        list.add(order9);
        list.add(order1);
        System.out.println(list);

        System.out.println();

        BiFunction<Order, Order,Integer> orderSort1 = (o1, o2) -> Integer.compare(o2.getPrice(),o1.getPrice());

        BiFunction<Order, Order,Integer> orderSort2 = (o1, o2) -> o1.getPrice()!=o2.getPrice()?Integer.compare(o1.getPrice(),o2.getPrice()):
                o1.getUser().getCity().compareTo(o2.getUser().getCity());

        BiFunction<Order, Order,Integer> orderSort3 = (o1, o2)-> !Objects.equals(o1.getItemName(), o2.getItemName()) ?
                o1.getItemName().compareTo(o2.getItemName()):
                !Objects.equals(o1.getShopIdentificator(), o2.getShopIdentificator()) ?
                        o1.getShopIdentificator().compareTo(o2.getShopIdentificator()):
                        o1.getUser().getCity().compareTo(o2.getUser().getCity());

        Collections.sort(list,orderSort1::apply);
        System.out.println("Sort list by Order price: "+list);


        Collections.sort(list,orderSort2::apply );

        System.out.println("Sort list by Order price increase and User City: "+list);

        Collections.sort(list, orderSort3::apply);

        System.out.println("Sort list by Order itemName and ShopIdenf and User City: "+ list);

        System.out.println("Delete  duplicates: "+ deleteDublicates(list));

        System.out.println("Detele items where prise less 1500" +  deleteItemsPriceLess(list,1500));

        System.out.println("Separated by Currency: ");
        separateForCurrency(list).entrySet().forEach(System.out::println);

        System.out.println("Separate Items for City: ");
        separateForCity(list).entrySet().forEach(System.out::println);
        System.out.println();
        System.out.println("====================SET===================");
        NavigableSet<Order> tree = new TreeSet<>((o1, o2) -> Long.compare(o1.getId(),o2.getId()) );

        tree.add(order1);
        tree.add(order2);
        tree.add(order3);
        tree.add(order4);
        tree.add(order5);
        tree.add(order6);
        tree.add(order2);
        tree.add(order4);
        tree.add(order7);
        tree.add(order10);

        System.out.println("Содержит ли Petrov:"+isContainLatsName(tree, "Petrov"));
        System.out.println(deleteCurrencyOrder(tree, Currency.USD));



    }


    public  static List deleteItemsPriceLess(List<? extends Order> list, int price){
        return list.stream()
                .filter(o -> o.getPrice()>price).collect(Collectors.toList());
    }


    public static List deleteDublicates(List<? extends Order> list){
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }


    public static Map separateForCurrency(List<? extends Order> list){
        return list.stream()
                .collect(Collectors.groupingBy(Order::getCurrency));
    }

    public static Map separateForCity(List<? extends Order> list){
        return list.stream()
                .collect(Collectors.groupingBy(o -> o.getUser().getCity()));
    }
    public  static Order isContainLatsName(Set<? extends Order> set, String name ){
        return set.stream()
                .filter(o -> o.getUser().getLastName().equals(name))
                .findAny()
                .get();

    }

    public static Set deleteCurrencyOrder(Set <?extends Order> set, Currency currency){
        return set.stream()
                .filter(o -> o.getCurrency()!=(currency)).collect(Collectors.toSet());
    }


}


