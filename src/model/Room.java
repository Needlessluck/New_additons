package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Room {
    String id;
    List<Slots> slots_for_room;

    public Room(String id) {
        this.id = id;
        this.slots_for_room=new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(id, room.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
