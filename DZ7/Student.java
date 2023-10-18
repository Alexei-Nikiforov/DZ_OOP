package DZ7;

public class Student implements Observer{

    private String name;
    private int salary = 20_000;


    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getMaxSalary()){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getNameVacancy(), vacancy.getMaxSalary());
            // this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getNameVacancy(), vacancy.getMaxSalary());
        }
    }


}
