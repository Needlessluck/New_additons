package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Building {
    String name;
    List<Level> level_in_building;

    public Building(String name) {
        this.name = name;
        this.level_in_building=new ArrayList<>();
    }

    public Level getlevel(String level){

        if(this.level_in_building.size()==0)return null;
        for(Level findlevel:level_in_building){
            if(findlevel.level.equals(level))return findlevel;
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(name, building.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
