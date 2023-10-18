package DZ7;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private Vacancy vacancy;

    private Publisher jobAgency;


    public Company(String name, Publisher jobAgency, Vacancy vacancy) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.vacancy = vacancy;
    }

    public Company(String name, Publisher jobAgency, Vacancy vacancy, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        vacancy.setMaxSalary(maxSalary);
        this.vacancy = vacancy;
    }

    public void needEmployee(){
        vacancy.setMaxSalary(random.nextInt(20_000, 100_000));
        jobAgency.sendOffer(name, vacancy);
    }

}
