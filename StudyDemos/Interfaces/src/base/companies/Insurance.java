package base.companies;

import base.list.OrganizationList;

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

    public void add(){
        new OrganizationList(this);
    }
    public void add(int index){
        new OrganizationList(index,this);
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
        return super.toString() + "\nСтавка: " + percent + "\nТелефон: " + number;
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

    @Override
    public int compare(Object obj1) {
        Insurance obj = (Insurance)obj1;
        if(this.equals(obj)) {
            return 0;
        }
        if(InsuranceSort == 1) {
            if (this.percent < obj.percent) {
                return 1;
            } else if (this.percent > obj.percent) {
                return -1;
            }
        }
        else if (InsuranceSort == 0){
            if (this.experience < obj.experience) {
                return 1;
            } else if (this.experience > obj.experience) {
                return -1;
            }
        }

        else {
            int l1 = this.name.length();
            int l2 = obj.name.length();
            int lmin = Math.min(l1, l2);

            for (int i = 0; i < lmin; i++) {
                int str1_ch = (int) this.name.charAt(i);
                int str2_ch = (int) obj.name.charAt(i);

                if (str1_ch != str2_ch) {
                    return str1_ch - str2_ch;
                }
            }
        }
        return 0;
    }

}
