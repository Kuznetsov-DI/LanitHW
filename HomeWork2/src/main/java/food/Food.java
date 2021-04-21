package food;

public class Food {

    final String name;
    final int saturation;

    public Food(String name, int saturation) {
        this.name = name;
        this.saturation = saturation;
    }

    public String getName() {
        return name;
    }

    public int getSaturation() {
        return saturation;
    }
}
