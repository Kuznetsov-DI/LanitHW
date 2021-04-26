import animals.Swim;
import exceptions.WrongFoodException;
import food.Grass;
import food.Meat;
import models.Worker;
import models.animals.*;

public class Zoo {

    public static void main(String[] args) throws WrongFoodException {

        Worker worker = new Worker("Dimka", 5);

        Cow cow = new Cow("Burenka","Muuu", "large");
        Duck duck = new Duck("Donald", "Crya","small");
        Elk elk = new Elk("Inokenti", "Moan", "giant");
        Fish fish = new Fish("Daysi", null, "small");
        Hawk hawk = new Hawk("Killer", "Agrhck", "middle");
        Tiger tiger = new Tiger("Sharhan", "AgrRrrrRrrr", "large");
        Tiger tiger2 = new Tiger("Marusya", "AgrRrrrRrrr", "large");

        Grass grass = new Grass("Chamomile", 3);
        Meat meat = new Meat("Veal", 7);

        System.out.println(elk.getLevelHungry());
        worker.feed(elk, grass);
        System.out.println(elk.getLevelHungry());
//        worker.feed(elk, meat);
//        System.out.println(elk.getLevelHungry());

        System.out.println(tiger.getLevelHungry());
        worker.feed(tiger, meat);
        System.out.println(tiger.getLevelHungry());
//        worker.feed(tiger, grass);
//        System.out.println(tiger.getLevelHungry());

    }
}
