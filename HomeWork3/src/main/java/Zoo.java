import animals.Carnivorous;
import animals.Herbivore;
import enums.EnclosureSize;
import exceptions.WrongFoodException;
import food.Grass;
import food.Meat;
import models.Aviary;
import models.Worker;
import models.animals.*;

public class Zoo {

    public static void main(String[] args) throws WrongFoodException {

        Worker worker = new Worker("Dimka", 5);

        Cow cow = new Cow("Burenka","Muuu", EnclosureSize.large);
        Duck duck = new Duck("Donald", "Crya",EnclosureSize.small);
        Elk elk = new Elk("Inokenti", "Moan", EnclosureSize.giant);
        Fish fish = new Fish("Daysi", null, EnclosureSize.small);
        Hawk hawk = new Hawk("Killer", "Agrhck", EnclosureSize.middle);
        Tiger tiger = new Tiger("Sharhan", "AgrRrrrRrrr", EnclosureSize.large);
        Tiger tiger2 = new Tiger("Marusya", "AgrRrrrRrrr", EnclosureSize.large);

        Grass grass = new Grass("Chamomile", 3);
        Meat meat = new Meat("Veal", 7);

        System.out.println(elk.getLevelHungry());
        worker.feed(elk, grass);
        System.out.println(elk.getLevelHungry());
//        worker.feed(elk, meat);

        System.out.println(tiger.getLevelHungry());
        worker.feed(tiger, meat);
        System.out.println(tiger.getLevelHungry());
//        worker.feed(tiger, grass);

        Aviary<Integer, Carnivorous> LargeAviaryWithPredators = new Aviary<>(EnclosureSize.large);
        Aviary<Integer, Carnivorous> SmallAviaryWithHerbivores = new Aviary<>(EnclosureSize.small);
        Aviary<Integer, Herbivore> GiantAviaryWithPredators = new Aviary<>(EnclosureSize.giant);
        Aviary<Integer, Herbivore> MiddleAviaryWithHerbivores = new Aviary<>(EnclosureSize.large);


    }
}
