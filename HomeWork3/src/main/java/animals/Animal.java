package animals;

import food.Food;

public abstract class Animal {

    final String name;
    protected int levelHungry;
    final String sound;


    protected Animal(String name, String sound) {
        this.name = name;
        this.levelHungry = 0;
        this.sound = sound;
    }

    protected Animal(String name, int levelHungry, String sound) {
        this.name = name;
        this.levelHungry = levelHungry;
        this.sound = sound;
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

    public void eat(Food food){}

}
