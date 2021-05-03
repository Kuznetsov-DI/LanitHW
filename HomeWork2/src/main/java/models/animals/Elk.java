package models.animals;

import animals.*;

public class Elk extends Herbivore implements Run, Swim, Voice {

    public Elk(String name, String sound) {
        super(name, sound);
    }

    protected Elk(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " бежит!");
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " плавает в пруду");
    }

    @Override
    public String voice() {
        return super.getSound();
    }
}
