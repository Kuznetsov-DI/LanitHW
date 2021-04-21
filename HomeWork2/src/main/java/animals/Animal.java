package animals;

import food.Food;

public abstract class Animal {

    final String name;
    final int levelHungry;
    final String sound;

    protected Animal(String name, int levelHungry, String sound) {
        this.name = name;
        this.levelHungry = levelHungry;
        this.sound = sound;
    }

    public void eat(Food food){}
}
