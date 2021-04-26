package models.animals;

import animals.Carnivorous;
import animals.Fly;
import animals.Run;
import animals.Swim;
import animals.Voice;
import enums.EnclosureSize;

public class Hawk extends Carnivorous implements Fly, Run, Swim, Voice {

    public Hawk(String name, String sound, EnclosureSize enclosureSize) {
        super(name, sound, enclosureSize);
    }

    public Hawk(String name, int levelHungry, String sound, String enclosureSize) {
        super(name, levelHungry, sound, enclosureSize);
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
