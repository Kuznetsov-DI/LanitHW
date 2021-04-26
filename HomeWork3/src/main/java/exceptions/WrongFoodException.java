package exceptions;

import food.Food;

public class WrongFoodException extends Exception{

    private Food foodForAnimal;

    public Food getFoodForAnimal() {
        return foodForAnimal;
    }

    public WrongFoodException (String message, Food food){
        super(message);
        foodForAnimal = food;
    }
}
