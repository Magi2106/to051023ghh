
import java.util.List;
class Building {
    private List<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
    public Building(List<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }
    public List<Room> getRooms() {
        return rooms;
    }
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}