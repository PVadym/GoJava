package finalProjectCore;

public class Main {

    public static void main(String[] args) {


//        System.out.println(Controller.registerUser(new User(100000, "DDD")));
//        System.out.println(Controller.registerUser(new User(99999, "DDD")));
        UserDAO userDAO = UserDAO.getUserDAO();
        userDAO.getBase().stream().forEach(System.out::println);


        userDAO.add(new User(1024,"Fhjk","vbnm"));
        User Gerg = new User(154,"Gerg","454");
        System.out.println("_________________________________");
        System.out.println(userDAO.getBase().contains(Gerg));
       userDAO.add(Gerg);
       userDAO.add(Gerg);
        userDAO.remove(Gerg);
        userDAO.edit(new User(554544, "", "kiu"));
       //userDAO.add();
        User user = new User(2641,"hfgjh","gh");
        userDAO.add(user);
        userDAO.remove(Gerg);



        User u = new User(15454, "fghj", "vb");
        userDAO.add(u);
        userDAO.add(new User(15454, "svf", "vb"));
        System.out.println(userDAO.edit(new User(15454, "fgh", "!!!")));
        //  userDAO.remove(Gerg);
        userDAO.remove(u);
        userDAO.getBase().stream().forEach(System.out::println);

        userDAO.add(null);
        userDAO.add(new User(0,null,null));
        userDAO.remove(null);
        userDAO.remove(Gerg);
        userDAO.getBase().stream().forEach(System.out::println);


        System.out.println(Controller.registerUser(u));

        Hotel hotel = new Hotel(100,"gh","fgh");
        Room room = new Room(100,500,2,hotel);
        RoomDAO.getRoomDAO().add(room);
        Controller.list.add(hotel);
        System.out.println(room);
        Controller.bookRoom(100,15454,100);
        Controller.bookRoom(100,154,100);
        Controller.cancelReservation(100,15454,100);
        Controller.cancelReservation(100,154,100);
//
//        try {
//            System.out.println(Controller.findHotelByName(null));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        RoomDAO roomDAO1 = new RoomDAO();
//        System.out.println(roomDAO1);
//        roomDAO1.getRoomList().stream()
//                .filter(room1 -> room1.getHotel().equals(new Hotel(1002,"Redison","Kyiv")))
//                .forEach(System.out::println);

//        HotelDAO hotelDAO = HotelDAO.getHotelDAO();
//        Hotel hoteletst = new Hotel(0, "a", "a1");
//        hotelDAO.add(hoteletst);
 //       Hotel hotel1 = new Hotel(3, "!!b", "b!!2");
//  //      hotelDAO.add(new Hotel(7, null, "b2"));
//        hotelDAO.add(new Hotel(3, "c", "c3"));
//        hotelDAO.add(new Hotel(5, "5", "c5"));
//
//        System.out.println();
//        hotelDAO.getBase().stream().forEach(System.out::println);
//        System.out.println("-----------------------------");
//        hotelDAO.edit(null);
   //     hotelDAO.remove(new Hotel(3, "!!b", "b!!2"));

//        hotelDAO.getBase().stream().forEach(System.out::println);
//        System.out.println(hoteletst.getRooms());
//        hotelDAO.remove(hoteletst);
//        System.out.println(hoteletst.getRooms());
//        System.out.println(RoomDAO.getRoomDAO().getBase());


//        UserDAO userDAO = UserDAO.getUserDAO();
//        userDAO.add(new User(10, "SL", "qwe"));
//        System.out.println();
//        userDAO.getBase().stream().forEach(System.out::println);
//
//        RoomDAO roomDAO = RoomDAO.getRoomDAO();
//
//        roomDAO.getBase().stream().forEach(System.out::println);
//        System.out.println(roomDAO.getBase());
//
//        roomDAO.add(null);
//        roomDAO.add(new Room(333,100,1,new Hotel(2, "b", "b2"),new User(10, "SL", "qwe")));
//
//
//        System.out.println(roomDAO.getBase());
//        roomDAO.remove(new Room(10,1500,1,hotel1));
//        roomDAO.remove(new Room(11,100,1,new Hotel(2, "b", "b2"),new User(10, "SL", "qwe")));
//        System.out.println(roomDAO.getBase());
//        roomDAO.remove(null);
//        roomDAO.remove(new Room(333,300,2,new Hotel(3, "c", "c3"),new User(10, "SL", "qwe")));
//        roomDAO.remove(new Room(11,100,1,new Hotel(2, "b", "b2")));
//        System.out.println(roomDAO.getBase());
//        roomDAO.add(new Room(54,100,1,new Hotel(2, "b", "b2"),new User(10, "SL", "qwe")));
//        HotelDAO.getHotelDAO().add(new Hotel(2, "b", "b2"));
//        roomDAO.add(new Room(51,100,1,new Hotel(2, "b", "b2"),new User(10, "SL", "qwe")));
//        roomDAO.edit(new Room(51,5422,1,new Hotel(2, "b", "b2"),new User(10, "SL", "qwe")));
//        roomDAO.remove(new Room(333,100,1,new Hotel(2, "b", "b2"),new User(10, "SL", "qwe")));
//        roomDAO.edit(null);
// //       userDAO.edit(null);
//        System.out.println(roomDAO.getBase());
//
//        System.out.println((new Hotel(2, "b", "b2")).getRooms());
//
//        HotelDAO.getHotelDAO().remove(new Hotel(2, "b", "b2"));
//        roomDAO.add(new Room(54,100,1,new Hotel(2, "b", "b2"),new User(10, "SL", "qwe")));
//        roomDAO.add(new Room(51,100,1,new Hotel(2, "b", "b2"),new User(10, "SL", "qwe")));
//
//

    }
}

