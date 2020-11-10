package org.example;

import org.example.models.Thing;

import java.util.ArrayList;
import java.util.List;

public class HomeSystem {
    private static HomeSystem instance;

    public static HomeSystem getInstance(){
        if(instance == null){
            instance = new HomeSystem();
        }
        return instance;
    }

    private final List<Thing> things;


    private HomeSystem() {
        this.things = new ArrayList<>();
    }

    public boolean addThing(Thing thing){
        return things.add(thing);
    }

    public List<Thing> getThings() {
        return things;
    }
}
