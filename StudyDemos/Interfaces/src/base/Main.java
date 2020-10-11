package base;

import base.companies.Factory;
import base.companies.Insurance;
import base.companies.Organization;
import base.companies.Shipbuilding;
import base.list.OrganizationList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Insurance o1 = new Insurance("БелСтрах", 20, 1994,7.5, "+375298978602");
        Insurance o2 = new Insurance("ГосСтрах", 22, 2001,5.5);
        Factory o3 = new Factory("ОбувьМарко", 22, 2000,80, 50000);
        Shipbuilding o4 = new Shipbuilding("ЛучшиеКорабли", 22, 1998,"Беларусь", "shipbuildBY@gmail.com");
        Shipbuilding o5 = new Shipbuilding("КорабльСтрой", 17, 2004,"Украина", "shipbuildUA@gmail.com");
        Factory o6 = new Factory("Белвест", 13, 2007,30, 20000);
        Factory o7 = new Factory("Витязь", 20, 2000,40, 900000);
        Insurance o8 = new Insurance("СтрахованиеЖизни", 5, 2015,2.5);
        Shipbuilding o9 = new Shipbuilding("ЛодкиПлывут", 10, 2010,"Россия", "shipbuildRU@gmail.com");

        OrganizationList list = new OrganizationList();
        //list.add(writeInsurance());


        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);
        list.add(o6);
        list.add(o7);
        list.add(o8);
        list.add(o9);

        System.out.println("Настроить сортировку?:\n1. Да.\n2. Нет.");
        Scanner reader = new Scanner(System.in);
        if(reader.nextInt() == 1) {
            System.out.println("Сортировать страховые компании по полю:\n1. Процентная ставка.\n2. Опыт работы.");
            reader = new Scanner(System.in);
            if(reader.nextInt() == 1) {
                list.get(0).setInsuranceSort(1);
            }
            else {
                list.get(0).setInsuranceSort(0);
            }

            System.out.println("Сортировать судостроительные компании по полю:\n1. Год основания.\n2. Адрес.");
            reader = new Scanner(System.in);
            if(reader.nextInt() == 1) {
                list.get(0).setShipbuildingSort(1);
            }
            else {
                list.get(0).setShipbuildingSort(0);
            }

            System.out.println("Сортировать заводы по полю:\n1. Объем продукции.\n2. Кол-во рабочих.");
            reader = new Scanner(System.in);
            if(reader.nextInt() == 1) {
                list.get(0).setFactorySort(1);
            }
            else {
                list.get(0).setFactorySort(0);
            }
        }


        list.sort();

        for (Organization i:list.getList()) {
            if(i == null){break;}
            System.out.println(list.get(i));
        }
    }

    public static Insurance writeInsurance(){
        Scanner reader = new Scanner(System.in);

        String name;
        int experience;
        int founded;
        double percent;
        String number;

        System.out.println("Enter Insurance company: ");
        String temp = reader.nextLine();

        String newTemp[] = temp.split(" ", 2);
        name = newTemp[0];
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        experience = Integer.parseInt(newTemp[0]);
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        founded = Integer.parseInt(newTemp[0]);
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        percent = Double.parseDouble(newTemp[0]);
        number = newTemp[1];
        newTemp = null;

        return new Insurance(name, experience, founded, percent, number);

    }

    public static Shipbuilding writeShipbuilding(){
        Scanner reader = new Scanner(System.in);

        String name;
        int experience;
        int founded;
        String address;
        String email;

        System.out.println("Enter Insurance company: ");
        String temp = reader.nextLine();

        String newTemp[] = temp.split(" ", 2);
        name = newTemp[0];
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        experience = Integer.parseInt(newTemp[0]);
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        founded = Integer.parseInt(newTemp[0]);
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        address = newTemp[0];
        email = newTemp[1];
        newTemp = null;

        return new Shipbuilding(name, experience, founded, address, email);

    }

    public static Factory writeFactory(){
        Scanner reader = new Scanner(System.in);

        String name;
        int experience;
        int founded;
        int product;
        int employees;

        System.out.println("Enter Insurance company: ");
        String temp = reader.nextLine();

        String newTemp[] = temp.split(" ", 2);
        name = newTemp[0];
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        experience = Integer.parseInt(newTemp[0]);
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        founded = Integer.parseInt(newTemp[0]);
        temp = newTemp[1];
        newTemp = null;

        newTemp = temp.split(" ", 2);
        product = Integer.parseInt(newTemp[0]);
        employees = Integer.parseInt(newTemp[1]);
        newTemp = null;

        return new Factory(name, experience, founded, product, employees);

    }
}
