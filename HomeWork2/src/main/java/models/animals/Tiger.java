package models.animals;

import animals.Carnivorous;
import animals.Run;
import animals.Swim;
import animals.Voice;

public class Tiger extends Carnivorous implements Run, Swim, Voice {
    protected Tiger(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }
}
