package src.EmployeeObjects;
public class FullTime extends Employe{
    private String name;
    private double hours,payRate;
    public FullTime(String name,double hours,double payRate)
    {
        this.hours=hours;
        this.payRate=payRate;
        this.name=name;
    }
    
    public double getPay() {
        return payRate;
    }
    public double getHours() {
        return hours;
    }
    public String getName() {
        return name;
    }
    public double getMoney() {
        double temp=payRate*hours;
        temp*=100;
        temp=Math.round(temp);
        temp/=100;
        return temp;
    }
    
}
