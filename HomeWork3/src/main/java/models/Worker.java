package models;

import animals.Animal;
import animals.Voice;
import food.Food;

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

    public void getVoice(Voice voice) { System.out.println(voice.voice()); }
}
