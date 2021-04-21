package models.animals;

import animals.Carnivorous;
import animals.Run;
import animals.Swim;
import animals.Voice;

public class Tiger extends Carnivorous implements Run, Swim, Voice {

    public Tiger(String name, String sound) {
        super(name, sound);
    }

    protected Tiger(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String voice() {
        return super.getSound();
    }
}
