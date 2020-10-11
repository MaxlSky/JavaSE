package base;


public class Main {

    public static void main(String[] args) throws myException {
        Collection myCol = new Collection();
        Insurance o1 = new Insurance("БелСтрах", 20, 1994,7.5, "+375298978602");
        Insurance o2 = new Insurance("ГосСтрах", 22, 2001,5.5, "+375337151902");
        Factory o3 = new Factory("ОбувьМарко", 20, 2000,80, 50000);
        Shipbuilding o4 = new Shipbuilding("ЛучшиеКорабли", 22, 1998,"Беларусь", "shipbuildBY@gmail.com");
        Shipbuilding o5 = new Shipbuilding("КорабльСтрой", 17, 2004,"Украина", "shipbuildUA@gmail.com");
        Factory o6 = new Factory("Белвест", 13, 2007,30, 20000);
        Factory o7 = new Factory("Витязь", 20, 2000,40, 900000);
        Insurance o8 = new Insurance("СтрахованиеЖизни", 5, 2015,2.5, "+375295186614");
        Shipbuilding o9 = new Shipbuilding("ЛодкиПлывут", 10, 2010,"Россия", "shipbuildRU@gmail.com");
        myCol.add(o1);
        myCol.add(o2);
        myCol.add(o3);
        myCol.add(o4);
        myCol.add(o5);
        myCol.add(o6);
        myCol.add(o7);
        myCol.add(o8);
        myCol.add(o9);
        myCol.menu();

    }


}


