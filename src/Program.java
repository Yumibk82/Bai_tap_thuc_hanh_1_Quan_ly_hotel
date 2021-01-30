import java.util.Scanner;

public class Program {

    static Scanner input = new Scanner(System.in);
    static int roomCount = 5;

    public static void main(String[] args) {

        Method m = new Method();
        int choice = 0;

        do {
            System.out.println("HOTEL MANAGEMENT");
            try {
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        if (roomCount > 0) {
                            System.out.println("How many customers rent a room?");
                            int num = Integer.parseInt(input.nextLine());
                            System.out.println("How many days will the customer rent?");
                            int days = Integer.parseInt(input.nextLine());

                            Room room = m.chooseAvailableRoom();
                            room.setDays(days);
                            for (int i = 0; i < num; i++) {
                                Customer c = m.addCustomer();
                                m.add(room, c);
                            }
                            room.setAvailable(false);
                            roomCount--;
                        } else {
                            System.out.println("Has no any room!!!");
                        }
                        break;
                    case 2:
                        if (roomCount < 5) {
                            Room room = m.chooseAvailableRoom();
                            m.delete(room);
                            roomCount++;
                        } else {
                            System.out.println("Nobody books a room.");
                        }
                        break;
                    case 3:
                        m.print();
                        break;
                    case 4:
                        if (roomCount > 0 && roomCount < 5) {
                            System.out.println("Which room the Customer want to change?");
                            Room currentRoom = m.chooseUnavailableRoom();
                            System.out.println("Which room does the Customer want to change?");
                            Room toRoom = m.chooseAvailableRoom();
                            m.update(currentRoom, toRoom);
                        }else if(roomCount==0){
                            System.out.println("Has not empty room to change!");
                        }else {
                            System.out.println("Nobody book a room!!!");}
                        break;
                    case 5:
                        break;
                }
            }
            catch(NumberFormatException e) {
                    System.out.println("It í illegal!!!");
                }
            catch (NullPointerException e){
                System.out.println("Enter wrong number of room");
            }
            }
        while (choice !=5);
        }
    }


