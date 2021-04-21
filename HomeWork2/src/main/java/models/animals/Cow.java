package models.animals;

import animals.Herbivore;
import animals.Run;
import animals.Voice;

public class Cow extends Herbivore implements Voice, Run {
    protected Cow(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }
}
