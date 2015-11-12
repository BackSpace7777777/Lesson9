package src.EmployeeObjects;
public class FullTime implements Employe{
    private String fn="",ln="";
    private double hours,payRate;
    public FullTime(String name,double hours,double payRate)
    {
        this.hours=hours;
        this.payRate=payRate;
        try
        {
            String[] temp=name.split(" ");
            fn=temp[0];
            ln=temp[1];
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    public double getPay() {
        return payRate;
    }
    public double getHours() {
        return hours;
    }
    public String getFirstName() {
        return fn;
    }
    public String getLastName() {
        return ln;
    }
    public String getName() {
        return fn + " " + ln;
    }
    public double getMoney() {
        double temp=payRate*hours;
        temp*=100;
        temp=Math.round(temp);
        temp/=100;
        return temp;
    }
    
}
