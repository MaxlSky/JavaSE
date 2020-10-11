package base.companies;

import base.list.OrganizationList;

import java.util.Scanner;

public abstract class Organization implements OrganizationComparable {

    static int  counter = 0;
    protected String name = "None";
    protected int sortV = 0;
    protected int experience = 0;
    protected int founded = 0;

    protected static int InsuranceSort = 1;

    public int getInsuranceSort() {
        return InsuranceSort;
    }
    public void setInsuranceSort(int insuranceSort) {
        InsuranceSort = insuranceSort;
    }

    protected static int ShipbuildingSort = 1;

    public int getShipbuildingSort() {
        return ShipbuildingSort;
    }
    public void setShipbuildingSort(int ShipbuildingSort) {
        ShipbuildingSort = ShipbuildingSort;
    }

    protected static int FactorySort = 1;

    public int getFactorySort() {
        return FactorySort;
    }
    public void setFactorySort(int FactorySort) {
        ShipbuildingSort = FactorySort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public int getSortV() {
        return sortV;
    }

    public void add(){
        new OrganizationList(this);
    }
    public void add(int index){
        new OrganizationList(index,this);
    }

    /*public Organization get(Object obj){
        return OrganizationList.get(obj);
    }*/

    public Organization(){
        counter++;
    }

    public Organization(String name){
        counter++;
        this.name = name;
        this.sortV = 0;
    }

    public Organization(String name, int experience){
        counter++;
        this.name = name;
        this.experience = experience;
        this.sortV = 0;
    }

    public Organization(String name, int experience, int founded){
        counter++;
        this.name = name;
        this.experience = experience;
        this.founded = founded;
        this.sortV = 0;
    }

    public void copy(Organization obj){
        this.name = obj.name;
        this.experience = obj.experience;
        this.founded = obj.founded;
    }



    @Override
    public String toString() {
        return "\nНазвание: " + name  + "\nЛет на рынке: " + experience + "\nГод основания: " + founded;
    }

    @Override
    public boolean equals(Object obj1) {
        Organization obj = (Organization)obj1;
        if (obj instanceof Organization) {
            if((obj.experience == this.experience) && (obj.name.equals(this.name)) && (obj.founded == this.founded)) {
                return true;
            }
            else{return false;}
        }
        return false;
    }

    public int compare(Object obj1) {

        Organization obj = (Organization)obj1;
        if(this.equals(obj)) {
            return 0;
        }
        if(this.experience < obj.experience) {
            return 1;
        }
        else if (this.experience > obj.experience) {
            return -1;
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
