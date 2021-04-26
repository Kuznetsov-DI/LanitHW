package models;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary <k, v extends Animal> {

    final int size;

    public Aviary(int size) {
        this.size = size;
    }

    enum enclosureSize { small, middle, large, giant}

    private final Map<k, v> map = new HashMap<>();

    public void add (Animal animal) {

    }

    public void remove (String name) {

    }

    public void getAnimal (String name) {

    }
}
