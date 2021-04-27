package animals;

import food.Food;
import food.Grass;

public class Herbivore extends Animal{

    protected Herbivore(String name, String sound) {
        super(name, sound);
    }

    protected Herbivore(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }

    public void eat(Food food){
        if (!(food instanceof Grass)) {
            System.out.println("Травоядные не едят мясо!");
            return;
        }
        levelHungry += food.getSaturation();
    }

}
