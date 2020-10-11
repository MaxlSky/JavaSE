package base;

import java.util.Scanner;

public class Insurance extends Organization {

    protected double percent = 0.0;
    protected String number = "None";

    public double getPercent() {
        return percent;
    }
    public void setPercent(double percent) {
        this.percent = percent;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public void add(Set someSet){
        someSet.add(this);
    }
    public void add(int index, Set someSet){
        someSet.add(index,this);
    }

    public Insurance(){
        super();
        this.sortV = 1;
    }

    public Insurance(String name, int experience){
        super(name, experience);
        this.sortV = 1;
    }

    public Insurance(String name, int experience, int founded){
        super(name, experience, founded);
        this.sortV = 1;
    }

    public Insurance(String name, int experience, int founded,double percent){
        super(name, experience, founded);
        this.percent = percent;
        this.sortV = 1;
    }

    public Insurance(String name, int experience, int founded,double percent, String number){
        super(name, experience, founded);
        this.percent = percent;
        this.number = number;
        this.sortV = 1;
    }


    @Override
    public String toString() {
        return super.toString() + " Ставка: " + percent + " Телефон: " + number  + "\n";
    }

    public void copy(Object obj1){
        Insurance obj = (Insurance)obj1;
        this.name = obj.name;
        this.experience = obj.experience;
        this.founded = obj.founded;
        this.percent = obj.percent;
        this.number = obj.number;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Insurance)){ return false; }

        var obj = (Insurance)obj1;
        if (obj instanceof Insurance) {
            if(super.equals(obj1) && (obj.percent == this.percent) && (obj.number.equals(this.number))) {
                return true;
            }
            else{return false;}
        }
        return false;
    }

}
