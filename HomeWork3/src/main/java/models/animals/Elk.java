package models.animals;

import animals.*;
import enums.EnclosureSize;

public class Elk extends Herbivore implements Run, Swim, Voice {

    public Elk(String name, String sound, EnclosureSize enclosureSize) {
        super(name, sound, enclosureSize);
    }

    public Elk(String name, int levelHungry, String sound, EnclosureSize enclosureSize) {
        super(name, levelHungry, sound, enclosureSize);
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " бежит!");
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " плавает в пруду");
    }

    @Override
    public String voice() {
        return super.getSound();
    }
}
