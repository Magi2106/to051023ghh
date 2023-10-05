import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(7, 31, 55);
        Room room2 = new Room(5, 87, 2);
        Room room3 = new Room(11, 532, 7000);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building = new Building(rooms, 15, 1, true);

        int totalLamps = countLampsInBuilding(building);
        System.out.println("Total number of lamps in the building: " + totalLamps);

        if (isNormal(building)) {
            System.out.println("This is a normal building.");
        } else {
            System.out.println("This is an odd building.");
        }
    }

    public static int countLampsInBuilding(Building building) {
        List<Room> rooms = building.getRooms();
        int totalLamps = 0;
        for (Room room : rooms) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static boolean isNormal(Building building) {
        int numberOfFloors = building.getNumberOfFloors();
        List<Room> rooms = building.getRooms();

        if (numberOfFloors > rooms.size()) {
            return true;
        } else {
            System.out.println("This is a very odd building.");
            return false;
        }
    }
}