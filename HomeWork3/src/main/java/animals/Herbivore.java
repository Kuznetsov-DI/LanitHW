package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal{

    protected Herbivore(String name, String sound) {
        super(name, sound);
    }

    protected Herbivore(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }

    public void eat(Food food){
        if (food instanceof Grass) {
            levelHungry += food.getSaturation();
        } else {
            System.out.println("Травоядные не едят мясо!");
        }
    }

}
