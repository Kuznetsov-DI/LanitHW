package models;

import animals.Animal;
import animals.Carnivorous;
import enums.EnclosureSize;

import java.util.HashMap;
import java.util.Map;

public class Aviary <k, v extends Animal> {

    private EnclosureSize enclossureSize;
    private static int count;

    public Aviary(EnclosureSize enclosureSize) {
        this.enclossureSize = enclosureSize;
        count++;
    }

    private final Map<Integer, Animal> map = new HashMap<>();

    public void add (Carnivorous carnivorous) {
//        switch (enclosureSize) {
//            case carnivorous.getEnclosureSize():
//                map.put(count, carnivorous);
//                break;
//
//        }
    }

    public void remove (String name) {

    }

    public void getAnimal (String name) {

    }
}
