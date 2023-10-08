package DZ4;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект
        * */
    public static void main(String[] args) {

        // создаем яблоко
        Apple apple = new Apple();

        // создаем апельсин
        Orange orange = new Orange();

        System.out.println("--------");
        //создаем 1 коробку и заполняем ее
        Box box1 = new Box<Apple>();
        System.out.println("Коробка 1 - " + box1);
        box1.addFruct(apple);
        box1.addFruct(apple);
        box1.addFruct(apple);
        box1.addFruct(orange);
        System.out.println("Коробка 1 - " + box1);

        System.out.println("--------");
        //создаем 2 коробку и заполняем ее
        Box box2 = new Box<Orange>();
        System.out.println("Коробка 2 - " + box2);
        box2.addFruct(orange);
        box2.addFruct(orange);
        box2.addFruct(orange);
        System.out.println("Коробка 2 - " + box2);

        System.out.println("--------");
        //проверяем вес коробок
        System.out.println(box1.compare(box2));

        System.out.println("--------");
        // после удаления 1 фрукта из 2 коробки снова проверяем вес коробок
        box2.deleteFruct(orange);
        System.out.println("Коробка 2 - " + box2);
        System.out.println(box1.compare(box2));

        System.out.println("--------");
        // создаем 3 коробку
        Box box3 = new Box<Apple>();
        System.out.println("Коробка 3 - " + box3);
        System.out.println("Коробка 1 - " + box1);

        // пересыпаем из 1 коробки в 3 коробку
        box1.pouringFruit(box3);
        System.out.println("Коробка 3 - " + box3);
        System.out.println("Коробка 1 - " + box1);

        System.out.println("--------");
        // пересыпаем из 3 коробки во 2 коробку
        box3.pouringFruit(box2);
        System.out.println("Коробка 3 - " + box3);
        System.out.println("Коробка 2 - " + box2);

        System.out.println("--------");
        // добавим в 3 коробку апельсин
        box3.addFruct(orange);
        System.out.println("Коробка 3 - " + box3);

        System.out.println("--------");
        // попытаемся забрать фрукт из 1 коробки
        box1.deleteFruct(apple);
        System.out.println("Коробка 1 - " + box1);

        System.out.println("--------");
        // попытаемся забрать яблоко из 2 коробки
        box2.deleteFruct(apple);
        System.out.println("Коробка 2 - " + box2);
    }
}
