package animals;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal {


    protected Carnivorous(String name, int levelHungry, String sound) {
        super(name, levelHungry, sound);
    }

    public void eat(Food food){
       if (food instanceof Meat) {

       } else {
           System.out.println("Хищники не едят траву!");
       }
    }
}
