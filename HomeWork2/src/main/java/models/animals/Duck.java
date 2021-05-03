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
        System.out.println(super.getName() + " летит!");
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
