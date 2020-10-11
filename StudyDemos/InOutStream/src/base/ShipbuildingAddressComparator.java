package base;

import java.util.Comparator;

public class ShipbuildingAddressComparator implements Comparator<Organization>{
    @Override
    public int compare(Organization obj1, Organization obj2) {
        if (obj1.getSortVariable() != 4 || obj2.getSortVariable() != 4){
            return 0;
        }
        Shipbuilding o1 = (Shipbuilding) obj1;
        Shipbuilding o2 = (Shipbuilding) obj2;
        int l1, l2, lmin, str1_ch, str2_ch;

        l1 = o1.address.length();
        l2 = o2.address.length();
        lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            str1_ch = (int) o1.address.charAt(i);
            str2_ch = (int) o2.address.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        return 0;
    }
}
