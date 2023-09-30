package DZ3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    
    private SortType sortType;

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    public AgeComparator(SortType sortType) {
        this.sortType = sortType;
    }

    public int compare(Employee o1, Employee o2) {

        if (sortType == SortType.Ascending){
            return Integer.compare(o1.calculateAge(),o2.calculateAge());
        }
        else {
            return Integer.compare(o2.calculateAge(), o1.calculateAge());
        }        
    }
}
