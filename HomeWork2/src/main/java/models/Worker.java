package models;

import animals.Animal;
import food.Food;
import models.animals.*;

public class Worker {

    final String name;
    final int experience;

    public Worker(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoice(Cow cow){
        System.out.println(cow.voice());
    }
    public void getVoice(Duck duck){
        System.out.println(duck.voice());
    }
    public void getVoice(Elk elk){
        System.out.println(elk.voice());
    }
    public void getVoice(Hawk hawk){
        System.out.println(hawk.voice());
    }
    public void getVoice(Tiger tiger){
        System.out.println(tiger.voice());
    }
}
