package models.animals;

import animals.Herbivore;
import animals.Fly;
import animals.Run;
import animals.Swim;
import animals.Voice;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    protected Duck(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }
}
