package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    String id;
    List<Slots> booked_slot;

    public User(String id) {
        this.id = id;
        this.booked_slot=new ArrayList<>();
    }

    public void getBookedroom(){
        for(Slots slot:booked_slot) {
            System.out.print(slot);

        }
    }
}
