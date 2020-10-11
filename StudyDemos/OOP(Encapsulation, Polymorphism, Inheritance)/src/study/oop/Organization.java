package study.oop;

public abstract class Organization {

    static int  counter = 0;
    protected String name = "None";
    protected int experience = 0;
    protected int founded = 0;

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
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


    public Organization(){
        counter++;
    }

    public Organization(String name){
        counter++;
        this.name = name;
    }

    public Organization(String name, int experience){
        counter++;
        this.name = name;
        this.experience = experience;
    }

    public Organization(String name, int experience, int founded){
        counter++;
        this.name = name;
        this.experience = experience;
        this.founded = founded;
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

}
