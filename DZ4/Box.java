package DZ4;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Box<T extends Fruct> {

    private LinkedList<T> fruits;

    private float wtBox;

    public Box() {
        this.fruits = new LinkedList<>();
    }

    public Box(Collection<T> fruits) {
        this.fruits = new LinkedList<>(fruits);
    }

    public Box(T... fruits) {
        this.fruits = new LinkedList<>(Arrays.asList(fruits));
    }


    public LinkedList<T> getFructs() {
        return fruits;
    }
   
    @Override
    public String toString() {
        if (this.getWeight() == 0)
        {
            return String.format("Коробка пустая");
        } else {
            return String.format("В коробке c %s находится %s и она весит %sf",
            this.getFructs().get(0), fruits, wtBox);
        }
    }

    /*
     * метод расчета веса коробки
     */
    public float getWeight() {
        if (fruits.size() == 0) {
            wtBox = 0f;
        } else {
            wtBox = fruits.size() * fruits.get(0).getWeight();
        }
        return wtBox;
    }

    /*
     * метод проверки веса текущей коробки с передаваемой в параметрах
     */
    public boolean compare(Box<T> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
        // if(this.getWeight() == box.getWeight()) {
        //     System.out.println("Веса обоих коробок равны");
        //     return true;
        // } else {
        //     System.out.println("Веса обоих коробок не равны");
        //     return false;
        // }
    }

    /*
     * метод добавления фрукта в коробку
     */
    public void addFruct(T fruit) {
        if(this.getWeight() == 0) {
            fruits.add(fruit);
            System.out.println("Фрукт добавлен");
        } else if((this.getWeight() > 0) && (this.getFructs().get(0).getClass() == fruit.getClass())) {
            fruits.add(fruit);
            System.out.println("Фрукт добавлен");
        } else {
            System.out.println("Нельзя добавить в текущую коробку, возьмите другую коробку.");
        }
    }

    /*
     * метод удаления фрукта из коробки
     */
    public void deleteFruct(T fruit) {
        if((this.getWeight() > 0 ) && (this.getFructs().get(0).getClass() == fruit.getClass())) {
            fruits.remove(fruit);
            System.out.println("Фрукт удален");
        } else {
            System.out.println("Не получится забрать фрукт");
        }
    }

    /*
     * метод пересыпания фруктов из одной коробки в другую
     */
    public void pouringFruit (Box<T> box) {
        if (box.getWeight() == 0) {
            box.getFructs().addAll(fruits);
            fruits.clear();
        } else if (this.getFructs().get(0).getClass() == box.getFructs().get(0).getClass()) {
            for (T fruit : fruits) {
                box.addFruct(fruit);        
            }
            for (T fruit : box.getFructs()) {
                this.deleteFruct(fruit);              
            }
        } else {
            System.out.println("Возьмите другую коробку, в текущую нельзя пересыпать");
        } 
    }
}
