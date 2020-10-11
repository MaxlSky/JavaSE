package base;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mySet set1 = new mySet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(7);
        set1.add(9);
        set1.add(11);
        set1.add(8);
        set1.add(7);
        set1.add(2);
        set1.add(1);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(16);
        set1.add(20);
        System.out.println("Задание А");
        System.out.println("Число по индексу 2: " + set1.get(2));
        set1.print();
        System.out.println(set1);
        System.out.println("Задание B");
        Product P1 = new Product(12345, "Топливо", "Нафтан", 9999, "12.01.2020" ,99999, true);
        //Product P1 = new Product();
        Product P2 = new Product(54321, "Самосвалы", "БелАЗ", 2222, "20.05.2077", 88888, false);
        //Product P2 = new Product();
        //write(P2);
        Product P3 = new Product(22222, "Шоколад", "Рошен", 1435, "12.08.2022", 33221, true);
        Product P4 = new Product(33333, "Шины", "Белшина", 5131, "15.03.2030", 20000, false);
        Product P5 = new Product(10101, "Конфеты", "Коммунарка", 100, "22.06.2025", 7000, true);
        Product P6 = new Product(42424, "Одежда", "Свитанак", 100, "18.10.2060", 60000, false);
        Product P7 = new Product(15551, "Обувь", "Марко", 120, "14.11.2057", 65000, false);
        Product P8 = new Product(61231, "Обувь", "Белвест", 135, "06.04.2025", 75000, true);
        Product P9 = new Product(89221, "Алкоголь", "Аливария", 80, "30.12.2045", 92000, true);
        Product P10 = new Product(56789, "Алкоголь", "Лидское", 180, "25.10.2035", 45000, false);

        Collection col1 = new Collection();
        col1.begin(P1,P2,P3,P4,P5,P6,P7,P8,P9,P10);
        System.out.println(col1);
    }

    static void write(Product obj){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a Product: ");
        String temp = reader.nextLine();

        String newTemp[] = temp.split(" ", 2);
        obj.setNumber(Integer.parseInt(newTemp[0]));
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        obj.setName(newTemp[0]);
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        obj.setManufacturer(newTemp[0]);
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        obj.setPrice(Integer.parseInt(newTemp[0]));
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        obj.setDate(newTemp[0]);
        obj.setAmount(Integer.parseInt(newTemp[1]));
        newTemp = null;

    }
}

