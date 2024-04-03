import  java.util.ArrayList;
import java.util.Scanner;

class Room {
    private int roomNumber;
    private String category;
    private boolean available;

    public Room(int roomNumber, String category, boolean available) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.available = available;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Hotel {
    private ArrayList<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
        // Initialize some rooms
        rooms.add(new Room(101, "Single", true));
        rooms.add(new Room(102, "Double", true));
        rooms.add(new Room(103, "Suite", true));
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        System.out.println("Room Number\tCategory");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println(room.getRoomNumber() + "\t\t" + room.getCategory());
            }
        }
    }

    public Room getRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        while (true) {
            System.out.println("Hotel Reservation System");
            System.out.println("1. Search available rooms");
            System.out.println("2. Make reservation");
            System.out.println("3. View booking details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.displayAvailableRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to reserve: ");
                    int roomNumber = scanner.nextInt();
                    Room room = hotel.getRoomByNumber(roomNumber);
                    if (room != null && room.isAvailable()) {
                        room.setAvailable(false);
                        System.out.println("Reservation successful!");
                    } else {
                        System.out.println("Room not available or does not exist.");
                    }
                    break;
                case 3:
                    // View booking details (not implemented in this example)
                    System.out.println("View booking details feature is not implemented yet.");
                    break;
                case 4:
                    System.out.println("Thank you for using Hotel Reservation System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}