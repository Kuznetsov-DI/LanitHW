package models;

import animals.Animal;
import enums.EnclosureSize;
import exceptions.WrongEnclosureSize;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Aviary<K, V extends Animal> extends HashMap {

    private EnclosureSize enclosureSize;
    private K k;
    private V v;


    public Aviary(EnclosureSize enclosureSize) {
        this.enclosureSize = enclosureSize;
    }

    private final Map<String, V> AviaryMap = new HashMap<>();

    public void add(V animal) throws WrongEnclosureSize {
        switch (String.valueOf(animal.getEnclosureSize())){
            case ("small"):
                AviaryMap.put(animal.getName(), animal);
                break;
            case ("middle"):
                if (enclosureSize.equals(EnclosureSize.small))
                    throw new WrongEnclosureSize("Размер вольера не подходит для животного!", enclosureSize);
                AviaryMap.put(animal.getName(), animal);
                break;
            case ("large"):
                if (enclosureSize.equals(EnclosureSize.small)
                        || enclosureSize.equals(EnclosureSize.middle))
                    throw new WrongEnclosureSize("Размер вольера не подходит для животного!", enclosureSize);
                AviaryMap.put(animal.getName(), animal);
                break;
            case ("giant"):
                if (enclosureSize.equals(EnclosureSize.small)
                        || enclosureSize.equals(EnclosureSize.middle)
                        || enclosureSize.equals(EnclosureSize.large))
                    throw new WrongEnclosureSize("Размер вольера не подходит для животного!", enclosureSize);
                AviaryMap.put(animal.getName(), animal);
                break;
        }
    }

    public void remove (String name) {
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
