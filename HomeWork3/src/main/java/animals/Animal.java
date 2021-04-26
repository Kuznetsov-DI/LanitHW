package animals;

import enums.EnclosureSize;
import exceptions.WrongFoodException;
import food.Food;

public abstract class Animal {

    final String name;
    protected int levelHungry;
    final String sound;
    final EnclosureSize enclosureSize;


    protected Animal(String name, String sound, EnclosureSize enclosureSize) {
        this.name = name;
        this.enclosureSize = enclosureSize;
        this.levelHungry = 0;
        this.sound = sound;
    }

    protected Animal(String name, int levelHungry, String sound, EnclosureSize enclosureSize) {
        this.name = name;
        this.levelHungry = levelHungry;
        this.sound = sound;
        this.enclosureSize = enclosureSize;
    }

    public String getName() {
        return name;
    }

    public int getLevelHungry() {
        return levelHungry;
    }

    public String getSound() {
        return sound;
    }

    public EnclosureSize getEnclosureSize() {
        return enclosureSize;
    }

    public void eat(Food food) throws WrongFoodException {
    }

}
