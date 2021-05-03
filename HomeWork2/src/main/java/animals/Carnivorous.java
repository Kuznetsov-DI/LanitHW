package animals;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal {


    protected Carnivorous(String name, String sound) {
        super(name, sound);
    }

    protected Carnivorous(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }

    public void eat(Food food) {
        if (!(food instanceof Meat)) {
            System.out.println("Хищники не едят траву!");
            return;
        }
        levelHungry += food.getSaturation();
    }
}
