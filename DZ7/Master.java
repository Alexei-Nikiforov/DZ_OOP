package DZ7;

public class Master implements Observer{

    private String name;
    private int salary = 80_000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getMaxSalary()){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getNameVacancy(), vacancy.getMaxSalary());
            // this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getNameVacancy(), vacancy.getMaxSalary());
        }
    }
}
