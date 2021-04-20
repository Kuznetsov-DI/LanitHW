package model;

public class Kotik {

    private int prettiness;
    private String name;
    private int weight;
    private String meow;

    public static int count;
    public static int levelSatiety;

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
    }

    public boolean play(){
        this.levelSatiety--;
        System.out.println(name + ", поиграл!");
        return true;
    }

    public boolean sleep(){
        this.levelSatiety--;
        System.out.println(name + ", поспал!");
        return true;
    }

    public boolean chaseMouse(){
        this.levelSatiety--;
        System.out.println(name + ", поймал мышь!");
        return true;
    }

    public boolean run(){
        this.levelSatiety--;
        System.out.println(name + ", побегал!");
        return true;
    }

    public boolean destroy(){
        this.levelSatiety--;
        System.out.println(name + ", сломал!");
        return true;
    }

    public void eat(int countFood){
        this.levelSatiety =+ countFood;
    }

    public void eat(int countFood, String nameFood){
        this.levelSatiety =+ countFood;
    }

    public void eat(){
        eat(5, "Meat");
    }

    public void liveAnotherDay(){
        for (int i = 0; i < 24; i++) {
            int random = (int) (Math.random()*5 + 1);
            if (levelSatiety > 0 ){
                switch (random){
                    case 1 : play();
                        break;
                    case 2 : sleep();
                        break;
                    case 3 : chaseMouse();
                        break;
                    case 4 : run();
                        break;
                    case 5 : destroy();
                        break;
                }
            } else {
                eat(5);
                i--;
            }
        }
    }
}

