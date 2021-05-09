package models.animals;

import animals.Herbivore;
import animals.Fly;
import animals.Run;
import animals.Swim;
import animals.Voice;
import enums.EnclosureSize;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {

    public Duck(String name, String sound, EnclosureSize enclosureSize) {
        super(name, sound, enclosureSize);
    }

    public Duck(String name, int levelHungry, String sound, EnclosureSize enclosureSize) {
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
