package exceptions;

import enums.EnclosureSize;

public class WrongEnclosureSize extends Exception{

    private EnclosureSize enclosureSizeForAnimal;

    public EnclosureSize getEnclosureSizeForAnimal() {
        return enclosureSizeForAnimal;
    }

    public WrongEnclosureSize (String message, EnclosureSize enclosureSize){
        super(message);
        enclosureSizeForAnimal = enclosureSize;
    }
}
