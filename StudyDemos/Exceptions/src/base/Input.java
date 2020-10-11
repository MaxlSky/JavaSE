package base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static Insurance writeInsurance() throws myException{
        Scanner reader = new Scanner(System.in);

        String name = null;
        int experience = 0;
        int founded = 0;
        double percent = 0;
        String number = null;
        System.out.println("Enter Insurance company: ");
        while(true) {
            try {
                String temp = reader.nextLine();

                String newTemp[] = temp.split(" ", 2);
                name = newTemp[0];
                temp = newTemp[1];

                newTemp = temp.split(" ", 2);
                experience = Integer.parseInt(newTemp[0]);
                temp = newTemp[1];

                newTemp = temp.split(" ", 2);
                founded = Integer.parseInt(newTemp[0]);
                temp = newTemp[1];

                newTemp = temp.split(" ", 2);
                percent = Double.parseDouble(newTemp[0]);
                number = newTemp[1];
                if(number.charAt(0) != '+'){
                    throw new myException();
                }
            } catch (myException|InputMismatchException|NumberFormatException e) {
                System.out.println("Некорректный ввод. Формат: String Int Int Double +String");
                Collection.ExceptionCounter++;
                //e.printStackTrace();
                name = null;
                experience = 0;
                founded = 0;
                percent = 0;
                number = null;
            }
            break;
        }
        return new Insurance(name, experience, founded, percent, number);

    }

    public static Shipbuilding writeShipbuilding() throws myException{
        Scanner reader = new Scanner(System.in);

        String name = null;
        int experience = 0;
        int founded = 0;
        String address = null;
        String email = null;

        System.out.println("Enter Shipbuilding company: ");
        String temp = reader.nextLine();
        while (true) {

            try {
                String newTemp[] = temp.split(" ", 2);
                name = newTemp[0];
                temp = newTemp[1];

                newTemp = temp.split(" ", 2);
                experience = Integer.parseInt(newTemp[0]);
                temp = newTemp[1];

                newTemp = temp.split(" ", 2);
                founded = Integer.parseInt(newTemp[0]);
                temp = newTemp[1];

                newTemp = temp.split(" ", 2);
                address = newTemp[0];
                email = newTemp[1];

                if(email.indexOf('@') == -1) {
                    throw new myException();
                }
            } catch (myException|InputMismatchException|NumberFormatException e) {
                System.out.println("Некорректный ввод. Формат: String Int Int String String@String");
                Collection.ExceptionCounter++;
                //e.printStackTrace();
                name = null;
                experience = 0;
                founded = 0;
                address = null;
                email = null;
            }
            break;
        }
        return new Shipbuilding(name, experience, founded, address, email);

    }

    public static Factory writeFactory() throws myException{
        Scanner reader = new Scanner(System.in);

        String name = null;
        int experience = 0;
        int founded = 0;
        int product = 0;
        int employees = 0;

        System.out.println("Enter Factory: ");
        String temp = reader.nextLine();
        while (true) {
            try {


                String newTemp[] = temp.split(" ", 2);
                name = newTemp[0];
                temp = newTemp[1];

                newTemp = temp.split(" ", 2);
                experience = Integer.parseInt(newTemp[0]);
                temp = newTemp[1];

                newTemp = temp.split(" ", 2);
                founded = Integer.parseInt(newTemp[0]);
                temp = newTemp[1];

                newTemp = temp.split(" ", 2);
                employees = Integer.parseInt(newTemp[0]);
                product = Integer.parseInt(newTemp[1]);

                if(founded < 1900 || founded > 2020) {
                    throw new myException();
                }

            } catch (myException|InputMismatchException|NumberFormatException e) {
                System.out.println("Некорректный ввод. Формат: String Int Int Int Int");
                Collection.ExceptionCounter++;
                //e.printStackTrace();
                name = null;
                experience = 0;
                founded = 0;
                product = 0;
                employees = 0;
            }
            break;
        }
        return new Factory(name, experience, founded, employees, product);

    }
}
