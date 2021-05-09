package models;

import animals.Animal;
import enums.EnclosureSize;
import exceptions.WrongEnclosureSize;

import java.util.HashMap;
import java.util.Map;

public class Aviary<V extends Animal>{

    private final EnclosureSize enclosureSize;

    public Aviary(EnclosureSize enclosureSize) {
        this.enclosureSize = enclosureSize;
    }

    private final Map<String, V> AviaryMap = new HashMap<>();

    public void add(V animal) throws WrongEnclosureSize {
        if (animal.getEnclosureSize().ordinal() > enclosureSize.ordinal())
            throw new WrongEnclosureSize("Размер вольера не подходит для животного!", enclosureSize);
        AviaryMap.put(animal.getName(), animal);
    }

    public void remove (String name) {
        AviaryMap.remove(name);
    }

    public void getAnimal(String name) {
        System.out.println(AviaryMap.get(name));
    }

}
