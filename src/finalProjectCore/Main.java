package finalProjectCore;

public class Main {

    public static void main(String[] args) {


//        System.out.println(Controller.registerUser(new User(100000, "DDD")));
//        System.out.println(Controller.registerUser(new User(99999, "DDD")));
        UserDAO userDAO = UserDAO.getUserDAO();
        userDAO.getUsersBase().stream().forEach(System.out::println);

       // userDAO.userBaseWriter(new User(1024,"Fhjk","vbnm"));
        User Gerg = new User(154,"Gerg","454");
        System.out.println("_________________________________");
        System.out.println(userDAO.getUsersBase().contains(Gerg));
       userDAO.add(Gerg);
       userDAO.add(Gerg);




        userDAO.getUsersBase().stream().forEach(System.out::println);

        userDAO.add(null);
//        userDAO.remove(Gerg);
        userDAO.getUsersBase().stream().forEach(System.out::println);
        User u = new User(15454, "fghj", "vb");

        System.out.println(Controller.registerUser(u));

        Hotel hotel = new Hotel(100,"gh","fgh");
        Room room = new Room(100,500,2,hotel);
        hotel.add(room);
        Controller.list.add(hotel);
        System.out.println(room);
        Controller.bookRoom(100,154,100);
        Controller.bookRoom(100,154,100);
        Controller.cancelReservation(100,154,100);
        Controller.cancelReservation(100,154,100);
        try {
            System.out.println(Controller.findHotelByName(null));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

