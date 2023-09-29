package DZ2;

public class Programm {
    public static void main(String[] args) {
        // Cat cat = new Cat("Barsik", 5);
        // Plate plate = new Plate(100);
        // plate.info();
        // cat.eat();
        // plate.setFood(plate.getFood() - cat.getAppetite());

        Plate plate = new Plate(70);

        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Персик", 20),
                new Cat("Снежок", 30),
                new Cat("Пушок", 40),
        };

        for (Cat cat : cats) {
            if (plate.getFood() >= cat.getAppetite()) {
                cat.eat();
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.printf("%s смог покушать. Его сытость - %s \n", cat.getName(), cat.isSatiety());
            } else {
                System.out.printf("%s не смог покушать. Его сытость - %s \n", cat.getName(), cat.isSatiety());
            }
        }
    }
}
