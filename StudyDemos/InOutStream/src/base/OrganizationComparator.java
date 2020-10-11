package base;

import java.util.Comparator;

public class OrganizationComparator implements Comparator<Organization> {
    @Override
    public int compare(Organization o1, Organization o2) {
        if (o1.getSortVariable() > o2.getSortVariable()){
            return 1;
        }
        if (o1.getSortVariable() < o2.getSortVariable()){
            return -1;
        }
        return 0;
        /*if(Organization.sortVariable == 4) {
            l1 = o1.manufacturer.length();
            l2 = obj.manufacturer.length();
            lmin = Math.min(l1, l2);

            for (int i = 0; i < lmin; i++) {
                str1_ch = (int) o1.manufacturer.charAt(i);
                str2_ch = (int) obj.manufacturer.charAt(i);

                if (str1_ch != str2_ch) {
                    return str1_ch - str2_ch;
                }
            }
        }



        if(Organization.sortVariable == 5) {
            String[] o1arr = o1.getDate().split("\\.", 3);
            String[] objarr = obj.getDate().split("\\.", 3);

            l1 = o1arr[2].length();
            l2 = objarr[2].length();
            lmin = Math.min(l1, l2);
            if(o1arr[2].equals(objarr[2])){
                l1 = o1arr[1].length();
                l2 = objarr[1].length();
                lmin = Math.min(l1, l2);
                if(o1arr[1].equals(objarr[1])) {
                    l1 = o1arr[0].length();
                    l2 = objarr[0].length();
                    lmin = Math.min(l1, l2);
                    for (int i = 0; i < lmin; i++) {
                        str1_ch = (int) o1arr[0].charAt(i);
                        str2_ch = (int) objarr[0].charAt(i);

                        if (str1_ch != str2_ch) {
                            return (str1_ch - str2_ch)*-1;
                        }
                    }
                }
                for (int i = 0; i < lmin; i++) {
                    str1_ch = (int) o1arr[1].charAt(i);
                    str2_ch = (int) objarr[1].charAt(i);

                    if (str1_ch != str2_ch) {
                        return (str1_ch - str2_ch)*-1;
                    }
                }
            }
            for (int i = 0; i < lmin; i++) {
                str1_ch = (int) o1arr[2].charAt(i);
                str2_ch = (int) objarr[2].charAt(i);

                if (str1_ch != str2_ch) {
                    return (str1_ch - str2_ch)*-1;
                }
            }
        }
        if(Organization.sortVariable == 6) {
            if (o1.amount < obj.amount) {
                return 1;
            } else if (o1.amount > obj.amount) {
                return -1;
            }
        }

        if(Organization.sortVariable == 7) {
            if (o1.certificate && !obj.certificate) {
                return -1;
            } else if (!o1.certificate && obj.certificate) {
                return 1;
            }
        }*/
    }
}
