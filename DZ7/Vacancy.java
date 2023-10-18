package DZ7;

public class Vacancy {

    private String nameVacancy;

    private int Salary;

    public Vacancy (String nameVacancy) {
        this(nameVacancy, 20000);
    }

    public Vacancy(String nameVacancy, int Salary) {
        this.nameVacancy = nameVacancy;
        this.Salary = Salary;
    }

    public String getNameVacancy() {
        return nameVacancy;
    }

    public int getMaxSalary() {
        return Salary;
    }

    public void setMaxSalary(int newSalary) {
        this.Salary = newSalary;
    }
}
