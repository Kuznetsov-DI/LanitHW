package models.animals;

import animals.Carnivorous;
import animals.Swim;

public class Fish extends Carnivorous implements Swim {
    protected Fish(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }
}
