package animals;

import exceptions.WrongFoodException;
import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal{

    protected Herbivore(String name, String sound, String enclosureSize) {
        super(name, sound, enclosureSize);
    }

    protected Herbivore(String name, int levelHungry, String sound, String enclosureSize) {
        super(name, levelHungry, sound, enclosureSize);
    }

    public void eat(Food food) throws WrongFoodException {
        if (!(food instanceof Grass)) throw new WrongFoodException("Еда не подходит для травоядного!", food);
        levelHungry += food.getSaturation();
    }
}
