package animals;

import enums.EnclosureSize;
import exceptions.WrongFoodException;
import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {


    protected Carnivorous(String name, String sound, EnclosureSize enclosureSize) {
        super(name, sound, enclosureSize);
    }

    protected Carnivorous(String name, int levelHungry, String sound, EnclosureSize enclosureSize) {
        super(name, levelHungry, sound, enclosureSize);
    }

    public void eat(Food food) throws WrongFoodException {
        if (!(food instanceof Meat)) throw new WrongFoodException("Еда не подходит для хищника!", food);
        levelHungry += food.getSaturation();
    }
}
