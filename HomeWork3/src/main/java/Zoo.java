import animals.Carnivorous;
import animals.Herbivore;
import enums.EnclosureSize;
import exceptions.WrongEnclosureSize;
import exceptions.WrongFoodException;
import food.Grass;
import food.Meat;
import models.Aviary;
import models.Worker;
import models.animals.*;

public class Zoo {

    public static void main(String[] args) throws WrongFoodException, WrongEnclosureSize {

        Worker worker = new Worker("Dimka", 5);

        Cow cow = new Cow("Burenka","Muuu", EnclosureSize.middle);
        Duck duck = new Duck("Donald", "Crya",EnclosureSize.small);
        Elk elk = new Elk("Inokenti", "Moan", EnclosureSize.giant);
        Elk elk2 = new Elk("Inokentisd", "Moan", EnclosureSize.large);
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

        Aviary<Carnivorous> LargeAviaryWithPredators = new Aviary<>(EnclosureSize.large);
        Aviary<Carnivorous> SmallAviaryWithHerbivores = new Aviary<>(EnclosureSize.small);
        Aviary<Herbivore> GiantAviaryWithPredators = new Aviary<>(EnclosureSize.giant);
        Aviary<Herbivore> MiddleAviaryWithHerbivores = new Aviary<>(EnclosureSize.middle);

        LargeAviaryWithPredators.add(tiger);
        MiddleAviaryWithHerbivores.add(cow);
        MiddleAviaryWithHerbivores.add(duck);
//        MiddleAviaryWithHerbivores.add(elk2);


        LargeAviaryWithPredators.getAnimal("Sharhan");
        LargeAviaryWithPredators.remove("Sharhan");
        LargeAviaryWithPredators.getAnimal("Sharhan");
        MiddleAviaryWithHerbivores.getAnimal("Burenka");
        MiddleAviaryWithHerbivores.getAnimal("Donald");

    }
}
