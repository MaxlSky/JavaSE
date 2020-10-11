package study.oop;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {


        Scanner reader = new Scanner(System.in);

        Product Product1 = new Product();
        add(Product1);
        //Product1.addCertificate();
        Product Product2 = new Product();
        add(Product2);

        Product ProductClone = new Product(Product1); // Клон

        System.out.println("\nProduct1 equals Product2?");
        if(Product1.equals(Product2)){
            System.out.println("Yes");
        }
        else{System.out.println("No");}

        System.out.println(Product1.getProduct());
        System.out.println(Product2.getProduct());
        reader.close();
    }

    static void add(Product obj){
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