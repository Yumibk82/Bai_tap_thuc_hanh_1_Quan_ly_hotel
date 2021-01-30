import java.util.ArrayList;

public class Method {

    static ArrayList<Room> rooms = new ArrayList<>();

    static {
        Room r1 = new Room(1, "Standard", 50);
        Room r2 = new Room(2, "VIP", 100);
        Room r3 = new Room(3, "Luxury", 500);
        Room r4 = new Room(4, "King", 1000);
        Room r5 = new Room(5, "Queen", 5000);
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);
        rooms.add(r5);
    }

    public void print() {
        boolean found = false;
        for (Room room : rooms) {
            if (!room.getCustomers().isEmpty()) {
                found = true;
                System.out.println("Room " + room.getRoomNo() + " has " + room.getCustomers().size() + " customers.");

                for (int i = 0; i < room.getCustomers().size(); i++) {
                    System.out.println(room.getCustomers().get(i).toString());
                }
            }
        }
//        if(found) System.out.println("Has no any a Customer!");
    }

    public Room chooseAvailableRoom() {
        Room roomChoice = null;
        System.out.println("Which room the Customer want to rent?");
        for (Room room : rooms) {
            if (room.isAvailable()) {

                System.out.println(room.toString());
            }
        }

        int choice = Integer.parseInt(Program.input.nextLine());
        for (Room room : rooms) {
            if (room.getRoomNo() == choice) {
                roomChoice = room;
            }
        }
        return roomChoice;
    }

    public Customer addCustomer(){
        System.out.println("Please enter Customer's name: ");
            String name = Program.input.nextLine();
        System.out.println("Please enter Customer's DOB: ");
            String date = Program.input.nextLine();
        System.out.println("Please enter Customer's identity: ");
            int identity = Integer.parseInt(Program.input.nextLine());
        return new Customer(name,date,identity);
    }
    public void add(Room r,Customer c){
        r.getCustomers().add(c);
        System.out.println("Add more "+c.toString()+" into "+r.toString()+" during "+r.getDays()+" days.");
    }

    public void delete(Room room){
        System.out.println("Total amount fee is "+room.calculateFee());
        room.getCustomers().clear();
        System.out.println("Customer in "+room.getRoomNo()+" already return the room.");
        room.setAvailable(true);
    }
    public Room chooseUnavailableRoom(){
        Room noRoom = null;
        System.out.println("Which room will the Customer return?");
        for (Room room: rooms) {
            if (!room.isAvailable()) {
                System.out.println(room.toString());
            }
        }
        int choice = Integer.parseInt(Program.input.nextLine());
        for (Room room :rooms) {
            if (room.getRoomNo() == choice) {
                noRoom = room;
            }
        }
        return noRoom;
    }
    public void update(Room currentRoom,Room toRoom){
        for (int i = 0; i < currentRoom.getCustomers().size(); i++) {
            toRoom.getCustomers().add(currentRoom.getCustomers().get(i));
        }
        toRoom.setAvailable(false);
        currentRoom.setAvailable(true);
        currentRoom.getCustomers().clear();
        System.out.println("Already transfer to new room!");
    }
}
