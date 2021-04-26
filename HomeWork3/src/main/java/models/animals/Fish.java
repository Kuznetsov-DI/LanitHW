package models.animals;

import animals.Carnivorous;
import animals.Swim;

public class Fish extends Carnivorous implements Swim {


    public Fish(String name, String sound, String enclosureSize) {
        super(name, sound, enclosureSize);
    }

    public Fish(String name, int levelHungry, String sound, String enclosureSize) {
        super(name, levelHungry, sound, enclosureSize);
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " плавает в пруду");
    }
}