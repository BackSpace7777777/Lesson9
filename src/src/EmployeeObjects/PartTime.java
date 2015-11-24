package src.EmployeeObjects;
public class PartTime extends Employe{
    public PartTime(String name,double hours,double payRate)
    {
        super.name=name;
        super.hours=hours;
        super.rate=payRate;
    }
    public double getActualPay() {
        double temp=rate*hours;
        temp*=100;
        temp=Math.round(temp);
        temp/=100;
        return temp;
    }
}
