package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {


    protected Carnivorous(String name, String sound) {
        super(name, sound);
    }

    protected Carnivorous(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }

    public void eat(Food food){
       if (food instanceof Meat) {
            levelHungry += food.getSaturation();
       } else {
           System.out.println("Хищники не едят траву!");
       }
    }

}
