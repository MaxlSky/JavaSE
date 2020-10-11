package base.companies;

import base.list.OrganizationList;

import java.util.Scanner;

public class Factory extends Organization {

    protected int employees = 0;
    protected int product = 0;

    public int getProduct() {
        return product;
    }
    public void setProduct(int product) {
        this.product = product;
    }

    public int getEmployees() {
        return employees;
    }
    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public void add(){
        new OrganizationList(this);
    }
    public void add(int index){
        new OrganizationList(index,this);
    }

    public Factory(){
        super();
        this.sortV = 3;
    }

    public Factory(String name, int experience){
        super(name, experience);
        this.sortV = 3;
    }
    public Factory(String name, int experience, int founded){
        super(name, experience,founded);
        this.sortV = 3;
    }

    public Factory(String name, int experience, int founded, int employees){
        super(name, experience,founded);
        this.employees = employees;
        this.sortV = 3;
    }

    public Factory(String name, int experience, int founded, int employees, int product){
        super(name, experience,founded);
        this.employees = employees;
        this.product = product;
        this.sortV = 3;
    }


    public void copy(Object obj1){
        Factory obj = (Factory) obj1;
        this.name = obj.name;
        this.experience = obj.experience;
        this.founded = obj.founded;
        this.employees = obj.employees;
        this.product = obj.product;
    }


    @Override
    public String toString() {
        return super.toString() + "\nРабочих: " + employees + "\nОбъем продукции: " + product;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Factory)){ return false; }

        var obj = (Factory)obj1;
        if (obj instanceof Factory) {
            if(super.equals(obj1) && (obj.employees == this.employees) && (obj.product == this.product)) {
                return true;
            }
            else{return false;}
        }
        return false;
    }

    @Override
    public int compare(Object obj1) {
        Factory obj = (Factory)obj1;
        if(this.equals(obj)) {
            return 0;
        }

        if(FactorySort == 1) {
            if(this.product < obj.product) {
                return 1;
            }
            else if (this.product > obj.product) {
                return -1;
            }
        }
        else if (FactorySort == 0){
            if(this.employees < obj.employees) {
                return 1;
            }
            else if (this.employees > obj.employees) {
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
