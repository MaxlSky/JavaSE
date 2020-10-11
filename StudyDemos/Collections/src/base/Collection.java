package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Collection {

    ArrayList<Product> myCol = new ArrayList<Product>();



    public void add(Product value)
    {
        this.myCol.add(value);
    }


    /*public void add(int index, Product value) { this.myCol.add(index, value); }*/


    /*public Product get() {
        Iterator<Product> iterator = this.myCol.iterator();
        return iterator.next();

    }*/

    /*public Product get(int index) {
        Iterator<Product> iterator = this.myCol.iterator();
        int i = 0;
        while(iterator.hasNext()){
            iterator.next();
            i++;
            if(i == index) {
                return iterator.next();
            }
        }
        return myCol.get(0);
    }*/

    public void begin(Product ... array) {
        for (int i = 0; i < array.length - 1; i++) {
            this.add(array[i]);
        }

        int choice = -1;
        int choice2 = -1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Выберите поле сортировки: ");
        System.out.println("1. Номер\n2. Наименование\n3. Производитель\n4. Цена\n5. Срок хранения\n6. Количество\n7. Сертификат \n");
        while (choice < 1 || choice > 7) {
            choice = reader.nextInt();
        }

        System.out.println("Выберите направление сортировки: ");
        System.out.println("1. Возрастание\n2. Убывание\n");
        while (choice2 < 1 || choice2 > 2) {
            choice2 = reader.nextInt();
        }
        Product.sortVariable = choice;

        ProductComparator myComparator = new ProductComparator();
        myCol.sort(myComparator);

        if (choice2 == 2) {
            Collections.reverse(myCol);
        }
    }

    /*public void set(int index) {
        int choice = -1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Выберите поле: ");
        System.out.println("1. Номер\n2. Наименование\n3. Производитель\n4. Цена\n5. Срок хранения\n6. Количество\n7. Сертификат \n");
        while(choice < 1 || choice > 7) {
            choice = reader.nextInt();
        }
        switch (choice) {
            case  (1):
                System.out.println("Введите номер: ");
                this.myCol.get(index).setNumber(reader.nextInt());
                break;
            case (2):
                System.out.println("Введите наименование: ");
                this.myCol.get(index).setName(reader.nextLine());
                break;
            case (3):
                System.out.println("Введите производителя: ");
                this.myCol.get(index).setManufacturer(reader.nextLine());
                break;
            case (4):
                System.out.println("Введите цену: ");
                this.myCol.get(index).setPrice(reader.nextInt());
                break;
            case (5):
                System.out.println("Введите срок годности: ");
                this.myCol.get(index).setDate(reader.nextLine());
                break;
            case (6):
                System.out.println("Введите количество: ");
                this.myCol.get(index).setAmount(reader.nextInt());
                break;
            case (7):
                System.out.println("Введите наличие сертификата: ");
                this.myCol.get(index).setCertificate(reader.nextBoolean());
                break;
            default:
                break;
        }

    }*/

    /*public ArrayList<Product> getList()
    {
        return this.myCol;
    }*/

   /* public void remove(int index){this.myCol.remove(index);}

    public void removeAll(Collection someCollection){
        this.myCol.removeAll(someCollection.getList());
    }

    public void retainAll(Collection someCollection) { myCol.retainAll(someCollection.getList()); }

    public void clear(){this.myCol.clear();}

    public boolean isEmpty(){return myCol.isEmpty();}

    public boolean contains(Product value){return myCol.contains(value);}

    public int size(){return myCol.size();}*/

    /*public void sort(){


        int choice = -1;
        int choice2 = -1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Выберите поле сортировки: ");
        System.out.println("1. Номер\n2. Наименование\n3. Производитель\n4. Цена\n5. Срок хранения\n6. Количество\n7. Сертификат \n");
        while(choice < 1 || choice > 7) {
            choice = reader.nextInt();
        }

        System.out.println("Выберите направление сортировки: ");
        System.out.println("1. Возрастание\n2. Убывание\n");
        while(choice2 < 1 || choice2 > 2) {
            choice2 = reader.nextInt();
        }
        Product.sortVariable = choice;

        ProductComparator myComparator = new ProductComparator();
        myCol.sort(myComparator);

        if(choice2 == 2) {
            Collections.reverse(myCol);
        }
    }*/


    @Override
    public String toString() {
        return myCol.toString();
    }

}
