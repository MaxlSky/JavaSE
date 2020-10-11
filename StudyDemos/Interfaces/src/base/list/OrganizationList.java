package base.list;
import base.companies.Organization;

import java.util.ArrayList;


public class OrganizationList {

    public ArrayList<Organization> orgs = new ArrayList<Organization>();


    public OrganizationList(){

    }

    public OrganizationList(Object obj){
        orgs.add((Organization) obj);
    }

    public OrganizationList(int index, Object obj){
        orgs.add(index, (Organization) obj);
    }


    public Organization get(int index){
        return orgs.get(index);
    }

    public Organization get(Object obj){
        return orgs.get(orgs.indexOf(obj));
    }

    public void add(Object obj){
        orgs.add((Organization) obj);
    }
    public void add(int index, Object obj){
        orgs.add(index, (Organization) obj);
    }

    public ArrayList<Organization> getList(){
        return orgs;
    }
    public void clear(){
        orgs.clear();
    }

    public void remove(int index){
        orgs.remove(index);
    }

    public void set(int index, Object obj){
        orgs.set(index, (Organization)obj);
    }

    public void sort(){
        Organization buf;

        boolean isSorted = false;
        int check = 0;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < orgs.size()-1; i++) {

                if (orgs.get(i).getSortV() > orgs.get(i + 1).getSortV()) {
                    isSorted = false;

                    buf = orgs.get(i);
                    orgs.set(i, orgs.get(i + 1));
                    orgs.set(i + 1, buf);
                }
                else if (orgs.get(i).getSortV() == orgs.get(i + 1).getSortV()) {
                    if ((orgs.get(i).compare(orgs.get(i + 1))) > 0) {
                        isSorted = false;

                        buf = orgs.get(i);
                        orgs.set(i, orgs.get(i + 1));
                        orgs.set(i + 1, buf);
                    }
                }
            }

            for (int i = 0; i < orgs.size()-1; i++){
                if (check > orgs.get(i).getSortV() ){
                    isSorted = false;
                    check = orgs.get(i).getSortV();
                    break;
                }
                check = orgs.get(i).getSortV();
            }
        }
    }

}
