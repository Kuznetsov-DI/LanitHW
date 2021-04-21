package models.animals;

import animals.Herbivore;
import animals.Fly;
import animals.Run;
import animals.Swim;
import animals.Voice;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {

    public Duck(String name, String sound) {
        super(name, sound);
    }

    protected Duck(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }

    @Override
    public void fly() {

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
