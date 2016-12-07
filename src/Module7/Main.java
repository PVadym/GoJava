package Module7;

import OFFLine.Off4.Connection;

import java.util.*;

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
        Order order9 = new Order(109, 15, Currency.USD, "I", "9", u9);
        Order order10 = new Order(110, 125, Currency.UAH, "J", "10", u10);

        List<Order> list = new ArrayList<Order>();

        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        list.add(order5);
        list.add(order6);
        list.add(order7);
        list.add(order8);
        list.add(order9);
        list.add(order10);
        System.out.println(list);

        List<Order> list1 = new ArrayList<Order>();
        System.out.println();

        list1.add(order1);
        list1.add(order2);
        list1.add(order3);
        list1.add(order4);
        list1.add(order5);
        list1.add(order6);
        list1.add(order7);
        list1.add(order8);
        list1.add(order9);
        list1.add(order10);


        Collections.sort(list,new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
        System.out.println("Sort list by Order price: "+list);

        Collections.sort(list,new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                int res = o2.getPrice() - o1.getPrice();
                if (res != 0)
                    return res;

                int res1 = o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    return res1;

            }
        });
        System.out.println("Sort list by Order price increase and User City: "+list);

        Collections.sort(list,new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                int res = o1.getItemName().compareTo(o2.getItemName());
                if (res == 0) {
                    int res1 = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                    if(res1==0){
                        int res2 = o1.getUser().getCity().compareTo(o2.getUser().getCity());
                        return res2;
                    }
                    return res1;
                }
                return res;
            }
        });

        System.out.println("Sort list by Order itemName and ShopIdenf and User City: "+ list);


            deleteDublicates( list);
            deleteItemsPriceLess(list,1500);
            separateForCurrency(list1);
            separateForCity(list1);

    }

    public static void deleteItemsPriceLess(List<Order> list, int price) {
        for(int i = list.size()-1;i>=0;i-- ){
            if(list.get(i).getPrice()<1500){
                list.remove(list.get(i));
            }
        }
        System.out.println("Detele items where prise less 1500" + list);

    }

    public static void deleteDublicates(List<Order> list) {

        for (int i =0; i<list.size(); i++){
            for (int j = i+1; j<list.size(); j++){
                if (list.get(i).equals(list.get(j))) list.remove(list.get(j));
            }
        }
        System.out.println("Delete  duplicates: "+list);


    }

    public static void separateForCurrency(List<Order> list){
        List<Order> listUSD = new ArrayList<Order>();
        List<Order> listUAH = new ArrayList<Order>();
        for(int i = 0;i < list.size();i++ ) {

            switch (list.get(i).getCurrency()) {
                case USD:
                    listUSD.add(list.get(i));
                    break;
                case UAH:
                    listUAH.add(list.get(i));
                    break;
            }
        }
        System.out.println("USD list: "+ listUSD);
        System.out.println("UAH list: "+ listUAH);
    }

    public static void separateForCity (List <Order> list){

        List <List<Order>> listOfList = new ArrayList<>();
        int size = list.size();

        for (int i = size-1; i >=0; i--){
            List<Order> listNew = new ArrayList<>();
            if (size==0) break;
            listNew.add(list.get(size-1));
            list.remove(size-1);
            size--;

            for (int j= listNew.size()-1; j >= 0; j--){

                for (int k =size-1; k >= 0;k-- ) {

                    if (listNew.get(j).getUser().getCity().equals(list.get(k).getUser().getCity())) {
                        listNew.add(list.get(k));
                        list.remove(k);
                        size--;
                    }
                }
            }
            listOfList.add(listNew);
        }
        System.out.println("Separate Items for City: ");
        for (List<Order> orderList : listOfList) {
            System.out.println(orderList);
        }
    }
}


