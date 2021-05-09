package animals;

import enums.EnclosureSize;
import exceptions.WrongFoodException;
import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal{

    protected Herbivore(String name, String sound, EnclosureSize enclosureSize) {
        super(name, sound, enclosureSize);
    }

    protected Herbivore(String name, int levelHungry, String sound, EnclosureSize enclosureSize) {
        super(name, levelHungry, sound, enclosureSize);
    }

    public void eat(Food food) throws WrongFoodException {
        if (!(food instanceof Grass)) throw new WrongFoodException("Еда не подходит для травоядного!", food);
        levelHungry += food.getSaturation();
    }
}
