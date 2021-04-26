package models.animals;

import animals.Herbivore;
import animals.Run;
import animals.Voice;
import enums.EnclosureSize;

public class Cow extends Herbivore implements Run, Voice {

    public Cow(String name, String sound, EnclosureSize enclosureSize) {
        super(name, sound, enclosureSize);
    }

    public Cow(String name, int levelHungry, String sound, String enclosureSize) {
        super(name, levelHungry, sound, enclosureSize);
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " бежит!");
    }

    @Override
    public String voice() {
        return super.getSound();
    }
}
