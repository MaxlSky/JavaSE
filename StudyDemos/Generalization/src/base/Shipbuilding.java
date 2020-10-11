package base;

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
        return super.toString() + " Адрес: " + address + " Email: " + email + "\n";
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

}
