package base;

import java.util.Scanner;

public abstract class Organization {

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

    public void add(Set someSet){
        someSet.add(this);
    }
    public void add(int index, Set someSet){
        someSet.add(index,this);
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
        return "Название: " + name  + " Лет на рынке: " + experience + " Год основания: " + founded;
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

}
