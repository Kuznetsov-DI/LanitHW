package models.animals;

import animals.Herbivore;
import animals.Run;
import animals.Voice;

public class Cow extends Herbivore implements Run, Voice {

    public Cow(String name, String sound) {
        super(name, sound);
    }

    protected Cow(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }

    @Override
    public void run() {
    }

    @Override
    public String voice() {
        return super.getSound();
    }
}
