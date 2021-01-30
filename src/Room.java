import java.util.ArrayList;

public class Room {

    private int roomNo;
    private String roomType;
    private double price;
    private int days;

    private boolean isAvailable = true;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Room(){
    }

    public Room(int roomNo, String roomType,int price) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.price = price;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public double calculateFee(){
        return price*days;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomNo +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                '}';
    }
}
