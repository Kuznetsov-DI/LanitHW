import animals.Animal;
import animals.Swim;
import food.Grass;
import food.Meat;
import models.Worker;
import models.animals.*;

public class Zoo {

    public static void main(String[] args) {

        Worker worker = new Worker("Dimka", 5);

        Cow cow = new Cow("Burenka","Muuu");
        Duck duck = new Duck("Donald", "Crya");
        Elk elk = new Elk("Inokenti", "Moan");
        Fish fish = new Fish("Daysi", null);
        Hawk hawk = new Hawk("Killer", "Agrhck");
        Tiger tiger = new Tiger("Sharhan", "AgrRrrrRrrr");
        Tiger tiger2 = new Tiger("Marusya", "AgrRrrrRrrr");

        Grass grass = new Grass("Chamomile", 3);
        Meat meat = new Meat("Veal", 7);

        System.out.println(elk.getLevelHungry());
        worker.feed(elk, grass);
        System.out.println(elk.getLevelHungry());
        worker.feed(elk, meat);
        System.out.println(elk.getLevelHungry());

        System.out.println(tiger.getLevelHungry());
        worker.feed(tiger, meat);
        System.out.println(tiger.getLevelHungry());
        worker.feed(tiger, grass);
        System.out.println(tiger.getLevelHungry());

        worker.getVoice(duck);
        worker.getVoice(cow);
        worker.getVoice(elk);
        worker.getVoice(hawk);
        worker.getVoice(tiger);

        Swim[] pond = {tiger, elk, hawk, fish, tiger2};
        for (int i = 0; i < pond.length; i++){
            pond[i].swim();
        }
    }
}
