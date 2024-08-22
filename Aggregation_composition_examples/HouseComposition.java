package Aggregation_composition_examples;

import java.util.ArrayList;
import java.util.List;

class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    // Other room-related methods
}

public class HouseComposition {
    private List<Room> rooms; // Composition

    public HouseComposition() {
        this.rooms = new ArrayList<>();
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Kitchen"));
    }

    public List<Room> getRooms() {
        return rooms;
    }

    // Other house-related methods
}
//here rooms data lies within the House class, hence,
//if house is destroyed, rooms are destroyed

//reference : https://medium.com/@salvipriya97/java-aggregation-and-composition-explained-with-examples-66cbffd21b9c