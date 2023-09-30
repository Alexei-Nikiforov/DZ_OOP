package DZ3;

public class Worker extends Employee {

    public Worker(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public Integer calculateAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s лет; Рабочий; Среднемесячная з/п (фиксированная): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }

}

