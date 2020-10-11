package base;

import java.util.Comparator;

public class InsurancePercentComparator implements Comparator<Organization>{
    @Override
    public int compare(Organization o1, Organization o2) {
        if (o1.getSortVariable() != 3 || o2.getSortVariable() != 3){
            return 0;
        }
        Insurance obj1 = (Insurance) o1;
        Insurance obj2 = (Insurance) o2;
        if (obj1.percent < obj2.percent) {
            return 1;
        } else if (obj1.percent > obj2.percent) {
            return -1;
        }
        return 0;
    }
}
