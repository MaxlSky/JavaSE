package base;

import java.util.Comparator;

public class FactoryEmployeesComparator implements Comparator<Organization>{
    @Override
    public int compare(Organization o1, Organization o2) {
        if (o1.getSortVariable() != 2 || o2.getSortVariable() != 2){
            return 0;
        }
        Factory obj1 = (Factory) o1;
        Factory obj2 = (Factory) o2;
        if (obj1.employees < obj2.employees) {
            return 1;
        } else if (obj1.employees > obj2.employees) {
            return -1;
        }
        return 0;
    }
}
