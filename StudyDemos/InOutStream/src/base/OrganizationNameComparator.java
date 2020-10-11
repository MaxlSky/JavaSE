package base;

import java.util.Comparator;

public class OrganizationNameComparator implements Comparator<Organization>{
    @Override
    public int compare(Organization o1, Organization o2) {
        int l1, l2, lmin, str1_ch, str2_ch;

        l1 = o1.name.length();
        l2 = o2.name.length();
        lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            str1_ch = (int) o1.name.charAt(i);
            str2_ch = (int) o2.name.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        return 0;
    }
}
