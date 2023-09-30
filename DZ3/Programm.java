package DZ3;

import java.util.Arrays;
import java.util.Random;

public class Programm {

    /*
     * Доработать приложение, которое мы разрабатывали на уроке. 
     * Мы доллжны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.

    1. Доработать класс Freelancer, при желании можно разработать и свой собственный тип сотрудника. 
    Формула расчета среднемесячной заработной платы может быть такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
    2. Переработать метод generateEmployees, метод должен создавать случайного сотрудника 
    (Worker, Freelancer или любого другого). Метод должен быть один!
    3. Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? 
    Тогда добавьте соответствующее состояние на уровне ваших классов).
    4. Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.
     */

    private static Random random = new Random();

    static Worker generateWorker(){

        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(50000, 120000);
        int age = random.nextInt(18, 61);
        
        Worker worker = new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age);
        return worker;
    }

    static Freelancer generateFreelancer() {
        
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int hourlySalary = random.nextInt(400,500);
        int age = random.nextInt(18, 61);

        Freelancer freelancer = new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], hourlySalary, age);
        return freelancer;
    }

    static Employee[] generateEmployees(int count){
        Employee[] array = new Employee[count];
        for (int i = 0; i < array.length; i++) {

            int employeeType = random.nextInt(2);

            switch(employeeType) {
                case 0:
                    array[i] = generateWorker();
                    break;
                case 1:
                    array[i] = generateFreelancer();
                    break;
                default:
                    array[i] = null;
            }
        }
        return array;
    }


    public static void main(String[] args) {

        Employee[] employees = generateEmployees(10);

        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new AgeComparator(SortType.Descending));
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        // Arrays.sort(employees, new SalaryComparator(SortType.Ascending));
        // for (Employee employee: employees) {
        //     System.out.println(employee);
        // }

        // System.out.println();

        // Arrays.sort(employees, new SalaryComparator(SortType.Descending));
        // for (Employee employee: employees) {
        //     System.out.println(employee);
        // }
    }   
}
