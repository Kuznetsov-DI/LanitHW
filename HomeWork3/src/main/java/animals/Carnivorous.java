package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {


    protected Carnivorous(String name, String sound, String enclosureSize) {
        super(name, sound, enclosureSize);
    }

    protected Carnivorous(String name, int levelHungry, String sound, String enclosureSize) {
        super(name, levelHungry, sound, enclosureSize);
    }

    public void eat(Food food){
       if (food instanceof Meat) {
            levelHungry += food.getSaturation();
       } else {
           System.out.println("Хищники не едят траву!");
       }
    }

}
