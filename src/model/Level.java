package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Level {
    String level;
    List<Room> rooms_on_level;

    public Level(String level) {
        this.level = level;
        this.rooms_on_level=new ArrayList<>();
    }
    public Room getRoom(String room){
        if(rooms_on_level.size()==0)return null;
        for(Room roomToFind:rooms_on_level)if(roomToFind.id==room)return roomToFind;
        return null;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Level level1 = (Level) o;
        return Objects.equals(level, level1.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }
}
