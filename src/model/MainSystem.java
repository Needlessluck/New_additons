package model;

import java.util.ArrayList;
import java.util.List;

public class MainSystem {
    static List<Building> list_of_building=new ArrayList<>();

    public static void main(String[] args) {
        addBuilding("a");
        addBuilding("b");
        addBuilding("a");
        addLevel("a","1");
        addLevel("c","1");
        addLevel("a","1");
        addRoom("a","1","room1");
        addRoom("d","1","r");
        addRoom("a","5","1");
        addRoom("a","1","room1");
    }
    public static boolean checkBuilding(String building){
        if(list_of_building.size()==0)return false;
        Building buildingtocheck=new Building(building);
        if(list_of_building.contains(buildingtocheck))return true;
        else return false;
    }
    public static Building getbuilding(String building){
        if(checkBuilding(building)){
            for(Building build:list_of_building)if(build.name==building)return build;
            return null;
        }
        else return null;
    }

    //for adding building
    public static void addBuilding(String building){
        if(getbuilding(building)==null){
            list_of_building.add(new Building(building));
            System.out.println(building+" building is added to system");
        }
        else{
            System.out.println("System has already building "+building);
        }
    }
    //for adding level in building
    public static void addLevel(String building,String level){
        if(getbuilding(building)==null){
            System.out.println(building+" building is not present");
            return;
        }
        else{
            if(getbuilding(building).getlevel(level)==null){
                getbuilding(building).level_in_building.add(new Level(level));
                System.out.println(level+" level is added to building "+building);
            }
            else{
                System.out.println(level+ " level is already added");
            }
        }
    }

    //for adding rooms on a level
    public static void addRoom(String building,String level,String room){
        if(getbuilding(building)!=null){
            if(getbuilding(building).getlevel(level)!=null){
                if(getbuilding(building).getlevel(level).getRoom(room)==null){
                    getbuilding(building).getlevel(level).rooms_on_level.add(new Room(room));
                    System.out.println(room+" room is added at level "+level+" in building "+building);
                }else{
                    System.out.println(room+" room is already present at level "+level+" in building "+building);
                }
            }else{
                System.out.println(level+" level is not present in building "+building);
            }
        }else{
            System.out.println(building+" building is not present");
        }
    }

    //for booking a room
    public static void bookARoom(String building,String level,String room,int start,int end,String user){
        if(getbuilding(building)!=null){
            if(getbuilding(building).getlevel(level)!=null){
                if(getbuilding(building).getlevel(level).getRoom(room)!=null){
                    Slots slot=new Slots(start,end);
                    if(getbuilding(building).getlevel(level).getRoom(room).slots_for_room.contains(slot)){
                        System.out.println("slot is already booked");
                    }else{
                          User user1=new User(user);
                          slot.status=true;
                          user1.booked_slot.add(slot);
                          getbuilding(building).getlevel(level).getRoom(room).slots_for_room.add(slot);
                    }
                }else{
                    System.out.println("room is not present");
                }
            }else{
                System.out.println("level is not present");
            }
        }else{
            System.out.println("building is not present");
        }
    }
}
