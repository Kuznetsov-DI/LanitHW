package models.animals;

import animals.Carnivorous;
import animals.Swim;

public class Fish extends Carnivorous implements Swim{

    public Fish(String name, String sound) {
        super(name, sound);
    }

    protected Fish(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }

    @Override
    public void swim() {

    }
}
