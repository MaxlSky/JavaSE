package base;

public class Product {

    static int sortVariable = -1;

    int number = 0;
    String name = "None";
    String manufacturer = "None";
    int price = 0;
    String date = "None";
    int amount = 0;
    boolean certificate = false;


    public int getSortVariable() {
        return sortVariable;
    }

    public void setSortVariable(int sortVariable) {
        this.sortVariable = sortVariable;
    }

    public int getNumber() {
        return number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isCertificate() {
        return certificate;
    }

    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }

    public void addCertificate() {
        this.certificate = true;
    }


    public Product(){
        int number = 0;
        String name = "None";
        String manufacturer = "None";
        int price = 0;
        String date = "None";
        int amount = 0;
    }
    public Product(int number){
        this.number = number;
    }

    public Product(int number , String name){
        this.number = number;
        this.name = name;
    }

    public Product(int number , String name, String manufacturer){
        this.number = number;
        this.name=name;
        this.manufacturer = manufacturer;
    }

    public Product(int number , String name, String manufacturer, int price){
        this.number = number;
        this.name=name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public Product(int number , String name, String manufacturer, int price, String date){
        this.number = number;
        this.name=name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.date = date;
    }

    public Product(int number , String name, String manufacturer, int price, String date, int amount){
        this.number = number;
        this.name=name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.date = date;
        this.amount = amount;
    }

    public Product(int number , String name, String manufacturer, int price, String date, int amount, boolean certificate){
        this.number = number;
        this.name=name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.date = date;
        this.amount = amount;
        this.certificate = certificate;
    }

    public Product(Product other) {
        this(other.getNumber(), other.getName(), other.getManufacturer(), other.getPrice(), other.getDate(), other.getAmount(), other.isCertificate());
    }

    public String getProduct() {
        return "\nНомер: " + number + " Наименование: " + name + " Производитель: " + manufacturer + " Цена: " + price + " Срок хранения: " + date + " Количество: " + amount + " Сертификат: " + certificate;
    }


    /*public int compare(Object obj1) {
        int l1, l2, lmin, str1_ch, str2_ch;
        Product obj = (Product) obj1;
        if(this.equals(obj)) {
            return 0;
        }
        if(sortVariable == 1) {
            if (this.number < obj.number) {
                return 1;
            } else if (this.number > obj.number) {
                return -1;
            }
        }

        if(sortVariable == 2) {
                l1 = this.name.length();
                l2 = obj.name.length();
                lmin = Math.min(l1, l2);

                for (int i = 0; i < lmin; i++) {
                    str1_ch = (int) this.name.charAt(i);
                    str2_ch = (int) obj.name.charAt(i);

                    if (str1_ch != str2_ch) {
                        return str1_ch - str2_ch;
                    }
                }
        }

        if(sortVariable == 3) {
            l1 = this.manufacturer.length();
            l2 = obj.manufacturer.length();
            lmin = Math.min(l1, l2);

            for (int i = 0; i < lmin; i++) {
                str1_ch = (int) this.manufacturer.charAt(i);
                str2_ch = (int) obj.manufacturer.charAt(i);

                if (str1_ch != str2_ch) {
                    return str1_ch - str2_ch;
                }
            }
        }

        if(sortVariable == 4) {
            if (this.price < obj.price) {
                return 1;
            } else if (this.price > obj.price) {
                return -1;
            }
        }

        if(sortVariable == 5) {
            l1 = this.date.length();
            l2 = obj.date.length();
            lmin = Math.min(l1, l2);

            for (int i = 0; i < lmin; i++) {
                str1_ch = (int) this.date.charAt(i);
                str2_ch = (int) obj.date.charAt(i);

                if (str1_ch != str2_ch) {
                    return str1_ch - str2_ch;
                }
            }
        }
        if(sortVariable == 6) {
            if (this.amount < obj.amount) {
                return 1;
            } else if (this.amount > obj.amount) {
                return -1;
            }
        }

        if(sortVariable == 7) {
            if (this.certificate && !obj.certificate) {
                return 1;
            } else if (!this.certificate && obj.certificate) {
                return -1;
            }
        }
        return 0;
    }*/

    @Override
    public String toString() {
        return "\nНомер: " + number + " Наименование: " + name + " Производитель: " + manufacturer + " Цена: " + price + " Срок хранения: " + date + " Количество: " + amount + " Сертификат: " + certificate;
    }

    @Override
    public boolean equals(Object obj1) {
        Product obj = (Product)obj1;
        if (obj instanceof Product) {
            if((obj.number == this.number) && (obj.name.equals(this.name)) && (obj.manufacturer.equals(this.manufacturer)) && (obj.date.equals(this.date)) && (obj.price == this.price)&& (obj.amount == this.amount) && (obj.certificate == this.certificate)) {
                return true;
            }
            else{return false;}
        }
        return false;
    }
}