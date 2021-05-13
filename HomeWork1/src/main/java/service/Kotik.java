package service;

public class Kotik {

    private int prettiness;
    private String name;
    private int weight;
    private String meow;

    private static int count;
    private static int levelSatiety;

    public Kotik() {
        this.prettiness = 0;
        this.name = null;
        this.weight = 0;
        this.meow = null;
        count++;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.levelSatiety = 0;
    }

    public boolean play() {
        if (isHungry()) {
            this.levelSatiety--;
            System.out.println(name + ", поиграл!");
            return true;
        } else {
            System.out.println(name + ", хочет есть!");
            return false;
        }
    }

    public boolean sleep() {
        if (isHungry()) {
            this.levelSatiety--;
            System.out.println(name + ", поспал!");
            return true;
        } else {
            System.out.println(name + ", хочет есть!");
            return false;
        }
    }

    public boolean chaseMouse() {
        if (isHungry()) {
            this.levelSatiety--;
            System.out.println(name + ", поймал мышь!");
            return true;
        } else {
            System.out.println(name + ", хочет есть!");
            return false;
        }
    }

    public boolean run() {
        if (isHungry()) {
            this.levelSatiety--;
            System.out.println(name + ", побегал!");
            return true;
        } else {
            System.out.println(name + ", хочет есть!");
            return false;
        }
    }

    public boolean destroy() {
        if (isHungry()) {
            this.levelSatiety--;
            System.out.println(name + ", сломал!");
            return true;
        } else {
            System.out.println(name + ", хочет есть!");
            return false;
        }
    }

    public void eat(int countFood) {
        this.levelSatiety = +countFood;
    }

    public void eat(int countFood, String nameFood) {
        this.levelSatiety = +countFood;
    }

    public void eat() {
        eat(5, "Meat");
    }

    public boolean isHungry() {
        if (this.levelSatiety >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void liveAnotherDay() {
        int i = 1;
        boolean check = false;
        while (i < 24) {
            if (check) {
                i++;
            }
            int random = (int) (Math.random() * 5 + 1);
            if (isHungry()) {
                switch (random) {
                    case 1:
                        check = play();
                        break;
                    case 2:
                        check = sleep();
                        break;
                    case 3:
                        check = chaseMouse();
                        break;
                    case 4:
                        check = run();
                        break;
                    case 5:
                        check = destroy();
                        break;
                }
            } else {
                check = false;
                eat();
            }
        }
    }
}

