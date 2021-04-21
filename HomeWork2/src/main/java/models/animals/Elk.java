package models.animals;

import animals.Herbivore;
import animals.Fly;
import animals.Run;
import animals.Voice;

public class Elk extends Herbivore implements Run, Fly, Voice {
    protected Elk(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }
}
