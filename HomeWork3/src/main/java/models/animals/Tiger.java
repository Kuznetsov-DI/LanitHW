package models.animals;

import animals.Carnivorous;
import animals.Run;
import animals.Swim;
import animals.Voice;
import enums.EnclosureSize;

public class Tiger extends Carnivorous implements Run, Swim, Voice {

    public Tiger(String name, String sound, EnclosureSize enclosureSize) {
        super(name, sound, enclosureSize);
    }

    public Tiger(String name, int levelHungry, String sound, EnclosureSize enclosureSize) {
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
