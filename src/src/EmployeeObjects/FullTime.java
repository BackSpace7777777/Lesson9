package src.EmployeeObjects;
public class FullTime extends Employe{
    public FullTime(String name,double hours,double payRate)
    {
        super.name=name;
        super.hours=hours;
        super.rate=payRate;
    }
    public double getActualPay() {
        double temp=0;
        if(hours>40)
        {
            temp=40*rate;
            temp+=(hours-40)*(rate*2);
            temp*=100;
            temp=Math.round(temp);
            temp/=100;
        }
        else
        {
            temp=rate*hours;
            temp*=100;
            temp=Math.round(temp);
            temp/=100;
        }
        return temp;
    }
}
