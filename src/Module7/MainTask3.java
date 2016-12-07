package Module7;


import java.util.*;
import java.lang.Comparable;

/**
 * Created by Вадим on 04.12.2016.
 */
public class MainTask3 {

    public static void main(String[] args) {


        User u1 = new User(1001, "Vasya", "Petrov", "Kyiv", 2000);
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
        Order order9 = new Order(109, 15, Currency.USD, "I", "9", u9);
        Order order10 = new Order(110, 125, Currency.UAH, "J", "10", u10);

        TreeSet<Order> tree = new TreeSet<>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return (int) (o1.getId() - o2.getId());
            }
        });

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


        System.out.println(tree.size());

        System.out.println(isContainLatsName(tree, "Petrov"));
        System.out.println(orderWithMaxPrice(tree));
        System.out.println(deleteCurrencyOrder(tree, Currency.USD));





    }

    public static  Set <Order> deleteCurrencyOrder(Set<Order> set, Currency currency) {
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(currency)) iterator.remove();
        }
        return set;

    }

    public static Order orderWithMaxPrice(TreeSet<Order> set) {
        Order maxPriceOrder = set.first();
        for (Order order : set) {
            if (maxPriceOrder.getPrice() < order.getPrice()) maxPriceOrder = order;
        }

        return maxPriceOrder;
    }

    public static boolean isContainLatsName(Set<Order> set, String lastName) {

        boolean isHas = false;
        for (Order order : set) {
            if (order.getUser().getLastName().contains(lastName)) {
                isHas = true;
            }
        }
        return isHas;
    }

}