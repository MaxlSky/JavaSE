package study.oop;

class Product {


    int number = 0;
    String name = "None";
    String manufacturer = "None";
    int price = 0;
    String date = "None";
    int amount = 0;
    boolean certificate = false;


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
        return "\nНомер: " + number + "\nНаименование: " + name + "\nПроизводитель: " + manufacturer + "\nЦена: " + price + "\nСрок хранения: " + date + "\nКоличество: " + amount + "\nСертификат: " + certificate;
    }


    @Override
    public String toString() {
        return "\nНомер: " + number + "\nНаименование: " + name + "\nПроизводитель: " + manufacturer + "\nЦена: " + price + "\nСрок хранения: " + date + "\nКоличество: " + amount + "\nСертификат: " + certificate;
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