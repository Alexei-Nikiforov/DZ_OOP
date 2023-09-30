package DZ3;

public class Freelancer extends Employee {

    public Freelancer(String surName, String name, double hourlySalary, int age) {
        super(surName, name, 20.8 * 8 * hourlySalary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public Integer calculateAge() {
        return age;
    }

    public String toString() {
        return String.format("%s %s; %s лет; Фрилансер; Среднемесячная з/п (переменная): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }

}
