package DZ2;

public class Cat {

    private String name;

    private int appetite;

    private boolean satiety;
    
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    
    public void eat() {
        satiety = true;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }
    
}
