package models;

import animals.Animal;
import enums.EnclosureSize;
import exceptions.WrongEnclosureSize;
import exceptions.WrongFoodException;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Aviary<k, v extends Animal> extends HashMap {

    private EnclosureSize enclosureSize;
    private String k;
    private v v;


    public Aviary(EnclosureSize enclosureSize) {
        this.enclosureSize = enclosureSize;
    }

    private final Map<String, Animal> AviaryMap = (Map<String, Animal>) new HashMap<k, v>();

    public void add(v animal) throws WrongEnclosureSize {
        if (!(enclosureSize.equals(animal.getEnclosureSize())))
            throw new WrongEnclosureSize("Размер вольера не подходит для животного!", enclosureSize);
        AviaryMap.put(animal.getName(), animal);

    }

    public void remove(String name) {
        AviaryMap.remove(name);
    }

    public void getAnimal(String name) {
        System.out.println(AviaryMap.get(name));
    }

    public final boolean equals(Aviary aviary) {
        if (aviary == this)
            return true;
        if (aviary instanceof Map.Entry) {
            Map.Entry<?, ?> e = (Map.Entry<?, ?>) aviary;
            if (Objects.equals(k, e.getKey()) &&
                    Objects.equals(k, e.getValue()))
                return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(k) ^ Objects.hashCode(v);
    }
}
