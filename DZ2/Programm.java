package DZ2;

public class Programm {

    /*
     * 1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот 
     * пытается покушать 15-20).
     * 2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), 
     * сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть 
     * наполовину сыт (это сделано для упрощения логики программы).
     * 3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию 
     * о сытости котов в консоль.
     * 4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
     */
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
