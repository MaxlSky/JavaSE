package study.oop;

public class Insurance extends Organization {

    protected double percent = 0.0;

    protected String number = "None";

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public Insurance(){
        super();
    }

    public Insurance(String name, int experience){
        super(name, experience);
    }

    public Insurance(String name, int experience, int founded){
        super(name, experience, founded);
    }

    public Insurance(String name, int experience, int founded,double percent){
        super(name, experience, founded);
        this.percent = percent;
    }

    public Insurance(String name, int experience, int founded,double percent, String number){
        super(name, experience, founded);
        this.percent = percent;
        this.number = number;
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
}
