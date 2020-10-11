package base;

import java.util.Comparator;

public class OrganizationFoundedComparator implements Comparator<Organization>{
    @Override
    public int compare(Organization o1, Organization o2) {
        if (o1.founded < o2.founded) {
            return 1;
        } else if (o1.founded > o2.founded) {
            return -1;
        }
        return 0;
    }
}
