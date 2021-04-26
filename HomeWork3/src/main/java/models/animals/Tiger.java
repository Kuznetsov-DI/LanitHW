package models.animals;

import animals.Carnivorous;
import animals.Run;
import animals.Swim;
import animals.Voice;

public class Tiger extends Carnivorous implements Run, Swim, Voice {

    public Tiger(String name, String sound, String enclosureSize) {
        super(name, sound, enclosureSize);
    }

    public Tiger(String name, int levelHungry, String sound, String enclosureSize) {
        super(name, levelHungry, sound, enclosureSize);
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
