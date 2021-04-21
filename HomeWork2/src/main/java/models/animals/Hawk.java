package models.animals;

import animals.Carnivorous;
import animals.Fly;
import animals.Run;
import animals.Swim;
import animals.Voice;

public class Hawk extends Carnivorous implements Fly, Run, Swim, Voice {

    public Hawk(String name, String sound) {
        super(name, sound);
    }

    protected Hawk(String name, int levelHungry, String sound) {
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
