package base;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int l1, l2, lmin, str1_ch, str2_ch;
        Product obj = (Product) o2;
        if(this.equals(obj)) {
            return 0;
        }
        if(Product.sortVariable == 1) {
            if (o1.number < obj.number) {
                return 1;
            } else if (o1.number > obj.number) {
                return -1;
            }
        }

        if(Product.sortVariable == 2) {
            l1 = o1.name.length();
            l2 = obj.name.length();
            lmin = Math.min(l1, l2);

            for (int i = 0; i < lmin; i++) {
                str1_ch = (int) o1.name.charAt(i);
                str2_ch = (int) obj.name.charAt(i);

                if (str1_ch != str2_ch) {
                    return str1_ch - str2_ch;
                }
            }
        }

        if(Product.sortVariable == 3) {
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

        if(Product.sortVariable == 4) {
            if (o1.price < obj.price) {
                return 1;
            } else if (o1.price > obj.price) {
                return -1;
            }
        }

        if(Product.sortVariable == 5) {
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
        if(Product.sortVariable == 6) {
            if (o1.amount < obj.amount) {
                return 1;
            } else if (o1.amount > obj.amount) {
                return -1;
            }
        }

        if(Product.sortVariable == 7) {
            if (o1.certificate && !obj.certificate) {
                return -1;
            } else if (!o1.certificate && obj.certificate) {
                return 1;
            }
        }
        return 0;
    }
}
