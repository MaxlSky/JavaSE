package study.oop;

public class Main {

    public static void main(String[] args) {
        Organization array[] = new Organization[10];

        Insurance o1 = new Insurance("test", 20, 1994,7.5, "+375298978602");
        Insurance o2 = new Insurance("spam", 22, 2001,5.5);
        Factory o3 = new Factory("spam", 22, 2000,80, 50000);

        Shipbuilding o4 = new Shipbuilding("spam", 22, 1998,"Беларусь", "shipbuild@gmail.com");
        Shipbuilding o5 = new Shipbuilding("spam", 22, 1998,"Беларусь", "shipbuild@gmail.com");

        array[0] = o1;
        array[1] = o2;
        array[2] = o3;
        array[3] = o4;
        array[4] = o5;

        for (Organization i:array) {
            if(i == null){break;}
            System.out.println(i);
        }

        System.out.println("\nРавны ли объекты 4 и 5: " + o4.equals(o5));
        System.out.println("\nКол-во объектов: " + Organization.counter);
    }
}
