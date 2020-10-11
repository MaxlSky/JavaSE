package base;

import java.util.Comparator;

public class OrganizationExperienceComparator implements Comparator<Organization>{
    @Override
    public int compare(Organization o1, Organization o2) {
        if (o1.experience < o2.experience) {
            return 1;
        } else if (o1.experience > o2.experience) {
            return -1;
        }
        return 0;
    }
}
