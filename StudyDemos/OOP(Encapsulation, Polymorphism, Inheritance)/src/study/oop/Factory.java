package study.oop;

public class Factory extends Organization {

    protected int employees = 0;
    protected int product = 0;

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public Factory(){
        super();
    }

    public Factory(String name, int experience){
        super(name, experience);
    }
    public Factory(String name, int experience, int founded){
        super(name, experience,founded);
    }

    public Factory(String name, int experience, int founded, int employees){
        super(name, experience,founded);
        this.employees = employees;
    }

    public Factory(String name, int experience, int founded, int employees, int product){
        super(name, experience,founded);
        this.employees = employees;
        this.product = product;
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

}
