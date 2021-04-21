package models.animals;

import animals.Carnivorous;
import animals.Fly;
import animals.Run;
import animals.Swim;
import animals.Voice;

public class Hawk extends Carnivorous implements Fly, Run, Swim, Voice {
    protected Hawk(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }
}