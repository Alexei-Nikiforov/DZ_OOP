package DZ7;

public class Middle implements Observer {

    private String name;
    private int salary = 55_000;

    public Middle(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getMaxSalary()){
            System.out.printf("Мидл %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getNameVacancy(), vacancy.getMaxSalary());
            // this.salary = salary;
        }
        else {
            System.out.printf("Мидл %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getNameVacancy(), vacancy.getMaxSalary());
        }
    }
    
}
