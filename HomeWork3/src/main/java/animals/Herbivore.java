package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal{

    protected Herbivore(String name, String sound, String enclosureSize) {
        super(name, sound, enclosureSize);
    }

    protected Herbivore(String name, int levelHungry, String sound, String enclosureSize) {
        super(name, levelHungry, sound, enclosureSize);
    }

    public void eat(Food food){
        if (food instanceof Grass) {
            levelHungry += food.getSaturation();
        } else {
            System.out.println("Травоядные не едят мясо!");
        }
    }

}
