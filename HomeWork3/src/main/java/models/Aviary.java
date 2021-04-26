package models;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary <k, v extends Animal> {

   // private enum enclosureSize { 10, 30, 60, 100}

    private final Map<k, v> map = new HashMap<>();

    public void add (Animal animal) {

    }

    public void remove (String name) {

    }

    public void getAnimal (String name) {

    }
}
