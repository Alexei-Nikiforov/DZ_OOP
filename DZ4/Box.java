package DZ4;

import java.util.ArrayList;

public class Box<T extends Fruct> {

    private ArrayList<T> fructs = new ArrayList<>();

    private float wtBox = 0f;

    public Box() {
        this.fructs = new ArrayList<>();
    }

    public ArrayList<T> getFructs() {
        return fructs;
    }
   
    @Override
    public String toString() {
        if (this.getWeight() == 0)
        {
            return String.format("Коробка пустая");
        } else {
            return String.format("В коробке c %s находится %s и она весит %sf",
            this.getFructs().get(0), fructs, wtBox);
        }
    }

    /*
     * метод расчета веса коробки
     */
    public float getWeight() {
        return wtBox;
    }

    /*
     * метод проверки веса текущей коробки с передаваемой в параметрах
     */
    public boolean compare(Box<T> box) {
        if(this.getWeight() == box.getWeight()) {
            System.out.println("Веса обоих коробок равны");
            return true;
        } else {
            System.out.println("Веса обоих коробок не равны");
            return false;
        }
    }

    /*
     * метод добавления фрукта в коробку
     */
    public void addFruct(T fruct) {
        if(this.getWeight() == 0) {
            fructs.add(fruct);
            wtBox = wtBox + fruct.getWeight();
            System.out.println("Фрукт добавлен");
        } else if((this.getWeight() > 0) && (this.getFructs().get(0).getClass() == fruct.getClass())) {
            fructs.add(fruct);
            wtBox += fruct.getWeight();
            System.out.println("Фрукт добавлен");
        } else {
            System.out.println("Нельзя добавить в текущую коробку, возьмите другую коробку.");
        }
    }

    /*
     * метод удаления фрукта из коробки
     */
    public void deleteFruct(T fruct) {
        if(this.getWeight() > 0) {
            fructs.remove(fruct);
            wtBox -= fruct.getWeight();
            System.out.println("Фрукт удален");
        } else {
            System.out.println("Коробка пустая, из нее нечего взять");
        }
    }

    /*
     * метод пересыпания фруктов из одной коробки в другую
     */
    public void pouringFruit (Box<T> box) {
        if (box.getWeight() == 0) {
            for (T fruct : fructs) {
                box.addFruct(fruct);        
            }
            for (T fruct : box.getFructs()) {
                this.deleteFruct(fruct);
            }
        } else if (this.getFructs().get(0).getClass() == box.getFructs().get(0).getClass()) {
            for (T fruct : fructs) {
                box.addFruct(fruct);        
            }
            for (T fruct : box.getFructs()) {
                this.deleteFruct(fruct);              
            }
        } else {
            System.out.println("Возьмите другую коробку, в текущую нельзя пересыпать");
        } 
    }
}
