package base.companies;

import base.list.OrganizationList;

import java.util.Scanner;

public class Shipbuilding extends Organization {

    protected String address = "None";
    protected String email = "None";

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void add(){
        new OrganizationList(this);
    }
    public void add(int index){
        new OrganizationList(index,this);
    }

    public Shipbuilding(){
        super();
        this.sortV = 2;
    }

    public Shipbuilding(String name, int experience){
        super(name, experience);
        this.sortV = 2;
    }

    public Shipbuilding(String name, int experience, int founded){
        super(name, experience, founded);
        this.sortV = 2;
    }

    public Shipbuilding(String name, int experience, int founded, String address){
        super(name, experience, founded);
        this.address = address;
        this.sortV = 2;
    }

    public Shipbuilding(String name, int experience, int founded, String address, String email){
        super(name, experience, founded);
        this.address = address;
        this.email = email;
        this.sortV = 2;
    }


    public void copy(Object obj1){
        Shipbuilding obj = (Shipbuilding) obj1;
        this.name = obj.name;
        this.experience = obj.experience;
        this.founded = obj.founded;
        this.address = obj.address;
        this.email = obj.email;
    }


    @Override
    public String toString() {
        return super.toString() + "\nАдрес: " + address + "\nEmail: " + email;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Shipbuilding)){ return false; }

        var obj = (Shipbuilding)obj1;
        if (obj instanceof Shipbuilding) {
            if( super.equals(obj1) && ((obj.address.equals(this.address))) && (obj.email.equals(this.email))) {
                return true;
            }
            else{return false;}
        }
        return false;
    }

    @Override
    public int compare(Object obj1) {
        Shipbuilding obj = (Shipbuilding) obj1;
        if(this.equals(obj)) {
            return 0;
        }

        if(ShipbuildingSort == 1) {
            if(this.founded > obj.founded) {
                return 1;
            }
            else if (this.founded < obj.founded) {
                return -1;
            }
        }
        else if (ShipbuildingSort == 0){
            int a1 = this.name.length();
            int a2 = obj.name.length();
            int amin = Math.min(a1, a2);

            for (int i = 0; i < amin; i++) {
                int stra1_ch = (int) this.name.charAt(i);
                int stra2_ch = (int) obj.name.charAt(i);

                if (stra1_ch != stra2_ch) {
                    return stra1_ch - stra2_ch;
                }
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
