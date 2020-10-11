package base;

import java.util.Comparator;

public class InsuranceNumberComparator implements Comparator<Organization>{
    @Override
    public int compare(Organization obj1, Organization obj2) {
        if (obj1.getSortVariable() != 3 || obj2.getSortVariable() != 3){
            return 0;
        }
        Insurance o1 = (Insurance) obj1;
        Insurance o2 = (Insurance) obj2;
        int l1, l2, lmin, str1_ch, str2_ch;

        l1 = o1.number.length();
        l2 = o2.number.length();
        lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            str1_ch = (int) o1.number.charAt(i);
            str2_ch = (int) o2.number.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        return 0;
    }
}
