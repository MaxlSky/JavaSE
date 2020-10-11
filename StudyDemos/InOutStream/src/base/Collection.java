package base;

import java.util.*;

public class Collection {

    ArrayList<Organization> myCol = new ArrayList<Organization>();
    static int ExceptionCounter = 0;


    public void add(Organization value)
    {
        this.myCol.add(value);
    }


    public void add(int index, Organization value) { this.myCol.add(index, value); }


    public Organization get() {
        Iterator<Organization> iterator = this.myCol.iterator();
        return iterator.next();

    }

    public Organization get(int index) {
        Iterator<Organization> iterator = this.myCol.iterator();
        int i = 0;
        while(iterator.hasNext()){
            iterator.next();
            i++;
            if(i == index) {
                return iterator.next();
            }
        }
        return myCol.get(0);
    }

    public void menu() throws myException {
        int choice = -1;
        Scanner reader = new Scanner(System.in);

            while (true) {
                System.out.println("\nВыберите действие: ");
                System.out.println("1. Добавить объект\n2. Сортировать контейнер\n3. Вывести на экран\n4. Выход");
                choice = -1;
                while (choice < 1 || choice > 4) {
                    choice = reader.nextInt();
                }
                if (choice == 1) {
                    choice = -1;
                    System.out.println("Выберите класс объекта: ");
                    System.out.println("\n1. Factory\n2. Insurance\n3. Shipbuilding");
                    while (choice < 1 || choice > 3) {
                        choice = reader.nextInt();
                    }
                    switch (choice) {
                        case 1: {
                            choice = -1;
                            myCol.add(Input.writeFactory());
                            if (ExceptionCounter != 0) {
                                this.myCol.remove(myCol.size() - 1);
                            }
                            break;
                        }
                        case 2: {
                            choice = -1;
                            myCol.add(Input.writeInsurance());
                            if (ExceptionCounter != 0) {
                                this.myCol.remove(myCol.size() - 1);
                            }
                            break;
                        }
                        case 3: {
                            choice = -1;
                            myCol.add(Input.writeShipbuilding());
                            if (ExceptionCounter != 0) {
                                this.myCol.remove(myCol.size() - 1);
                            }
                            break;
                        }
                    }
                }
                if (choice == 2) {
                    this.sort();
                }
                if (choice == 3) {
                    System.out.println("\nmyCol: " + myCol);
                }

                if (choice == 4) {
                    break;
                }
            }

        }

    public ArrayList<Organization> getList()
    {
        return this.myCol;
    }

    public void remove(int index){this.myCol.remove(index);}

    public void removeAll(Collection someCollection){
        this.myCol.removeAll(someCollection.getList());
    }

    public void retainAll(Collection someCollection) { myCol.retainAll(someCollection.getList()); }

    public void clear(){this.myCol.clear();}

    public boolean isEmpty(){return myCol.isEmpty();}

    public boolean contains(Organization value){return myCol.contains(value);}

    public int size(){return myCol.size();}

    public void sort(){


        int choice = -1;
        int choice2 = -1;
        Scanner reader = new Scanner(System.in);

        choice = -1;
        System.out.println("Сортировать по классам?: ");
        System.out.println("1. Да\n2. Нет\n");
        while(choice < 1 || choice > 2) {
            choice = reader.nextInt();
        }
        if (choice == 1) {
            OrganizationComparator myOrganizationComparator = new OrganizationComparator();
            myCol.sort(myOrganizationComparator);
        }
        choice = -1;
        System.out.println("Выберите поле сортировки: ");
        System.out.println("1. Название\n2. Лет на рынке\n3. Год основания\n");
        while(choice < 1 || choice > 3) {
            choice = reader.nextInt();
        }

        System.out.println("Выберите направление сортировки: ");
        System.out.println("1. Возрастание\n2. Убывание\n");
        while(choice2 < 1 || choice2 > 2) {
            choice2 = reader.nextInt();
        }


        switch (choice){
            case 1:{
                OrganizationNameComparator myComparatorName = new OrganizationNameComparator();
                myCol.sort(myComparatorName);
                break;
            }
            case 2:{
                OrganizationExperienceComparator myComparatorExperience = new OrganizationExperienceComparator();
                myCol.sort(myComparatorExperience);
                break;
            }
            case 3:{
                OrganizationFoundedComparator myComparatorFounded = new OrganizationFoundedComparator();
                myCol.sort(myComparatorFounded);
                break;
            }
        }


        choice = -1;
        System.out.println("Использовать дополнительную сортировку?: ");
        System.out.println("1. Да\n2. Нет\n");
        while(choice < 1 || choice > 2) {
            choice = reader.nextInt();
        }
        if (choice == 1) {
            choice = -1;
            System.out.println("Дополнительная сортировка Factory: ");
            System.out.println("1. Рабочие\n2. Объем продукции\n");
            while(choice < 1 || choice > 2) {
                choice = reader.nextInt();
            }
            switch (choice){
                case 1:{
                    FactoryEmployeesComparator myComparatorName = new FactoryEmployeesComparator();
                    myCol.sort(myComparatorName);
                    break;
                }
                case 2:{
                    FactoryProductComparator myComparatorExperience = new FactoryProductComparator();
                    myCol.sort(myComparatorExperience);
                    break;
                }
            }
            choice = -1;
            System.out.println("Дополнительная сортировка Insurance: ");
            System.out.println("1. Процентная ставка\n2. Телефон\n");
            while(choice < 1 || choice > 2) {
                choice = reader.nextInt();
            }
            switch (choice){
                case 1:{
                    InsurancePercentComparator myComparatorName = new InsurancePercentComparator();
                    myCol.sort(myComparatorName);
                    break;
                }
                case 2:{
                    InsuranceNumberComparator myComparatorExperience = new InsuranceNumberComparator();
                    myCol.sort(myComparatorExperience);
                    break;
                }
            }
            choice = -1;
            System.out.println("Дополнительная сортировка Shipbuilding: ");
            System.out.println("1. Адрес\n2. Email\n");
            while(choice < 1 || choice > 2) {
                choice = reader.nextInt();
            }
            switch (choice){
                case 1:{
                    OrganizationNameComparator myComparatorName = new OrganizationNameComparator();
                    myCol.sort(myComparatorName);
                    break;
                }
                case 2:{
                    OrganizationExperienceComparator myComparatorExperience = new OrganizationExperienceComparator();
                    myCol.sort(myComparatorExperience);
                    break;
                }
            }
        }



        if(choice2 == 2) {
            Collections.reverse(myCol);
        }
    }



    @Override
    public String toString() {
        return myCol.toString();
    }

}
